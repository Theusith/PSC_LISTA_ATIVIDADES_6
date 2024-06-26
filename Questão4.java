/*Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
consultar;
efetuar reserva; e
sair.
Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções:
por número do voo;
por origem; e
por destino.
Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. O programa deverá dar as seguintes respostas:
reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
voo lotado — caso não exista lugar disponível nesse voo;
voo inexistente — caso o código do voo não exista.
A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de consulta ou reserva, o programa volta ao menu principal.
*/
import java.util.Scanner;

public class Main {
    private static int[] voos = new int[12];
    private static String[] origens = new String[12];
    private static String[] destinos = new String[12];
    private static int[] lugares = new int[12];
    private static Scanner sc = new Scanner(System.in);


    public static void mostrarVoos(){
        for(int i = 0; i < voos.length; i++){
            System.out.println(voos[i]);
        }
        for(int i = 0; i < origens.length; i++){
            System.out.println(origens[i]);
        }
        for(int i = 0; i < destinos.length; i++){
            System.out.println(destinos[i]);
        }
        for(int i = 0; i < lugares.length; i++){
            System.out.println(lugares[i]);
        }
    }

    public static void main(String[] args) {
        inicializarDados();
        mostrarVoos();

        int opcao;
        do {
            System.out.println("1. Consultar\n2. Efetuar reserva\n3. Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    consultar();
                    break;
                case 2:
                    efetuarReserva();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static void inicializarDados() {
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o numero do voo numero " + (i + 1) + ":");
            voos[i] = sc.nextInt();
            
            System.out.println("Digite o nome do origem numero " + (i + 1) + ":");
            origens[i] = sc.next();
            
            System.out.println("Digite o nome do destino numero " + (i + 1) + ":");
            destinos[i] = sc.next();
            
            System.out.println("Digite a quatidade de lugares do voo numero " + (i + 1) + ":");
            lugares[i] = sc.nextInt();
        }
    }

    private static void consultar() {
        System.out.println("1. Por número do voo\n2. Por origem\n3. Por destino");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o número do voo:");
                int voo = sc.nextInt();
                for (int i = 0; i < 12; i++) {
                    if (voos[i] == voo) {
                        System.out.println("Origem: " + origens[i] + ", Destino: " + destinos[i] + ", Lugares disponíveis: " + lugares[i]);
                        return;
                    }
                }
                System.out.println("Voo inexistente.");
                break;
            case 2:
                System.out.println("Digite a origem:");
                String origem = sc.next();
                for (int i = 0; i < 12; i++) {
                    if (origens[i].equals(origem)) {
                        System.out.println("Voo: " + voos[i] + ", Destino: " + destinos[i] + ", Lugares disponíveis: " + lugares[i]);
                        return;
                    }
                }
                System.out.println("Nenhum voo com a origem especificada.");
                break;
            case 3:
                System.out.println("Digite o destino:");
                String destino = sc.next();
                for (int i = 0; i < 12; i++) {
                    if (destinos[i].equals(destino)) {
                        System.out.println("Voo: " + voos[i] + ", Origem: " + origens[i] + ", Lugares disponíveis: " + lugares[i]);
                        return;
                    }
                }
                System.out.println("Nenhum voo com o destino especificado.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void efetuarReserva() {
        System.out.println("Digite o número do voo:");
        int voo = sc.nextInt();
        for (int i = 0; i < 12; i++) {
            if (voos[i] == voo ) {
                if (lugares[i] > 0) {
                    lugares[i]--;
                    System.out.println("Reserva confirmada.");
                } else {
                    System.out.println("Voo lotado.");
                }
                return;
            }
        }
        System.out.println("Voo inexistente.");
    }
}
