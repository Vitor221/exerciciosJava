package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int elementsQuantity = sc.nextInt();
        int[] vect = new int[elementsQuantity];

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                sum += vect[i];
            }
        }

        double mediaPair = (double) sum / elementsQuantity;
        if(mediaPair == 0.0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPair));
        }

    }
}
