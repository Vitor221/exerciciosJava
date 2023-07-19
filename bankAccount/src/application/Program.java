package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bankAccount = new Bank();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        bankAccount.setAccountNumber(accountNumber);

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        bankAccount.setAccountName(accountName);

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposite = sc.nextDouble();
            bankAccount.addDeposit(initialDeposite);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.print(bankAccount);

        System.out.println();
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.addDeposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdrawValue(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
    }
}
