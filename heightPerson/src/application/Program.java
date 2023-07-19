package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantityPerson = sc.nextInt();
        Person[] persons = new Person[quantityPerson];

        for(int i = 0; i < persons.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            persons[i] = new Person(name, age, height);
        }

        System.out.println();

        double sum = 0;
        for(int i = 0; i < persons.length; i++) {
            sum += persons[i].getHeight();
        }

        double heightMid = sum / persons.length;

        System.out.printf("Altura média: %.2f%n", heightMid);

        double quantityMinorAge = 0;
        for(int i = 0; i < persons.length; i++) {
            if(persons[i].getAge() < 16) {
                quantityMinorAge += 1;
            }
        }

        double percentMinorAge = quantityMinorAge / persons.length * 100;

        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentMinorAge) + "%");

        for(int i = 0; i < persons.length; i++) {
            if(persons[i].getAge() < 16) {
                System.out.println(persons[i].getName());
            }
        }

    }
}
