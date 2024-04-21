//Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros:");

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            if(verificaPrimo(vetor[i]))
                System.out.println("O numero " + vetor[i] + " é primo e está na posição " + i + " do vetor.");
        }
        sc.close;
    }
    public static boolean verificaPrimo(Integer num){
        if (num <= 1) return false;

        for(int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
