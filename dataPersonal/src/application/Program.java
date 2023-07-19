package application;

import entities.Personal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int personQuantity = sc.nextInt();
        Personal[] data = new Personal[personQuantity];

        for(int i = 0; i < data.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double high = sc.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
            char gender = sc.next().charAt(0);

            data[i] = new Personal(high, gender);
        }

        double minorHigh = Double.POSITIVE_INFINITY;
        for(int i = 1; i < data.length; i++) {
            if(data[i].getHigh() < minorHigh) {
                minorHigh = data[i].getHigh();
            }
        }
        System.out.println("Menor altura = " + minorHigh);

        double largerHigh = 0;
        for(int i = 1; i < data.length; i++) {
            if(data[i].getHigh() > largerHigh) {
                largerHigh = data[i].getHigh();
            }
        }
        System.out.println("Maior altura = " + largerHigh);

        double sumHigh = 0;
        int quantityFemale = 0;
        int quantityMale = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i].getGender() == 'F') {
                sumHigh += data[i].getHigh();
                quantityFemale++;
            }
            if(data[i].getGender() == 'M'){
                quantityMale++;
            }
        }
        double mediaHighFemale = sumHigh / quantityFemale;
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaHighFemale));
        System.out.println("Número de homens = " + quantityMale);
    }
}
