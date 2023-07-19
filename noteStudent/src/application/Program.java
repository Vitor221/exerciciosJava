package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student studentInfo = new Student();

        studentInfo.name = sc.nextLine();
        studentInfo.noteFirst = sc.nextDouble();
        studentInfo.noteSecond = sc.nextDouble();
        studentInfo.noteThird = sc.nextDouble();


        if(studentInfo.mediaNote() >= 90.00) {
            System.out.printf("FINAL GRADE = %.2f%n", studentInfo.mediaNote());
            System.out.println("PASS");
        } else if (studentInfo.mediaNote() <= 60.00) {
            System.out.printf("FINAL GRADE = %.2f%n", studentInfo.mediaNote());
            System.out.println("FAILED");
            System.out.printf("MISSING " + studentInfo.remainingNote() + " POINTS");
        }

    }
}
