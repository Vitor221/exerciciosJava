package application;

import entities.Individuals;
import entities.LegalEntity;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if(ic == 'i') {
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();

                list.add(new Individuals(name, annualIncome, healthSpending));
            } else if(ic == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployee = sc.nextInt();

                list.add(new LegalEntity(name, annualIncome, numberEmployee));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        for(TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.totalTaxPayer()));
        }

        double sum = 0;
        for(TaxPayer tp : list) {
            sum += tp.totalTaxPayer();
        }

        System.out.println();

        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
    }
}
