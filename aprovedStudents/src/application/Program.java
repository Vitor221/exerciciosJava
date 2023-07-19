package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int studentQuantity = sc.nextInt();
        Student[] students = new Student[studentQuantity];

        for(int i = 0; i < students.length; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            String name = sc.nextLine();
            double note1 = sc.nextDouble();
            double note2 = sc.nextDouble();

            students[i] = new Student(name, note1, note2);
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < students.length; i++) {
            double sumNotes = students[i].getNote1() + students[i].getNote2();
            double avgNote = sumNotes / 2;

            if(avgNote >= 6.0) {
                System.out.println(students[i].getName());
            }
        }

    }
}
