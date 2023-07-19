package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantityNumbers = sc.nextInt();

        double[] vect = new double[quantityNumbers];
        for(int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for(int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();

        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / vect.length;
        System.out.printf("MEDIA = %.2f%n", avg);

    }

}
