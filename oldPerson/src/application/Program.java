package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int quantityPersons = sc.nextInt();
        Person[] dataPerson = new Person[quantityPersons];

        for(int i = 0; i < dataPerson.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            dataPerson[i] = new Person(name, age);
        }

        int ageOld = 0;
        String nameOld = "";
        for(int i = 0; i < dataPerson.length; i++) {
            if(dataPerson[i].getAge() > ageOld) {
                ageOld = dataPerson[i].getAge();
                nameOld = dataPerson[i].getName();
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nameOld);

    }
}
