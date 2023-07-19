package application;

import entities.Persons;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int manyRooms = sc.nextInt();
        int rooms = 10;
        Persons[] rent = new Persons[rooms];

        for(int i = 0; i < manyRooms; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[i] = new Persons(name, email, room);
        }

        int busyRooms = 0;
        for(int i = 0; i < manyRooms; i++) {
            if(rent[i] != null && rent[i].getRoom() >= busyRooms) {
                busyRooms = rent[i].getRoom();
                System.out.println(busyRooms + ": " + rent[i].getName() + ", " + rent[i].getEmail());
            }
        }



    }
}
