package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numbersQuantity = sc.nextInt();
        int[] vect = new int[numbersQuantity];


        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("NÚMEROS PARES: ");
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println();
        System.out.println();

        int quantityPair = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                quantityPair += 1;
            }
        }

        System.out.print("QUANTIDADE DE PARES = " + quantityPair);
    }
}
