package application;

import entities.Employeed;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employeed> vect = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            vect.add(new Employeed(id, name, salary));

        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int valueID = sc.nextInt();

        double salaryIncreased = 0.0;
        for(Employeed employeed : vect) {
            if(valueID == employeed.getId()) {
                salaryIncreased = employeed.getSalary();
            }
        }


        System.out.println();

    }

}
