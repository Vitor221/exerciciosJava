package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numberQuantity = sc.nextInt();
        double[] vect = new double[numberQuantity];
        double max = 0;
        double min = 0;

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < vect.length; i++) {
            max = vect[i];
            min = vect[i];
        }

        if (max > min) {
            System.out.print("MAIOR VALOR = " + max);
        }

    }
}
