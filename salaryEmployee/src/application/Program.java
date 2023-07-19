package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employeed = new Employee();

        System.out.print("Name: ");
        employeed.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employeed.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employeed.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f%n", employeed.name, employeed.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employeed.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f%n", employeed.name, employeed.netSalary());
    }
}
