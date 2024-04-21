import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorIntercalado[] = new int[20];

        System.out.println("Preencha o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Preencha o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[2 * i] = vetor1[i];
            vetorIntercalado[2 * i + 1] = vetor2[i];
        }
        for (int j : vetorIntercalado) {
            System.out.print(j + " ");
        }
    sc.close();
    }
}
