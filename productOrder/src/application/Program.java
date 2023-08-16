package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDay = sdf.parse(sc.next());

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order clientOrder = new Order(new Date(), new Client(clientName, clientEmail, clientBirthDay), OrderStatus.valueOf(status.toUpperCase()));

        for(int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem items = new OrderItem(quantity, new Product(productName, productPrice), productPrice);
            clientOrder.addItem(items);
        }

        System.out.println();

        System.out.print(clientOrder);
    }
}
