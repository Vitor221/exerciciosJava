import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        int X = sc.nextInt();
//
//        for(int i = 0; i < x; i++) {
//            if(i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

//        System.out.println("-----------------------------------------------------");
//
//        int N = sc.nextInt();
//
//        int in = 0;
//        int out = 0;
//
//        for(int i = 0; i < N; i++) {
//            int x = sc.nextInt();
//
//            if(x >= 10 && x <= 20) {
//                in = in + 1;
//            } else {
//                out = out + 1;
//            }
//
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

//        System.out.println("-----------------------------------------------------");
//
//        int N = sc.nextInt();
//
//        double media;
//        double somaPesos = 2.0 + 3.0 + 5.0;
//
//        for(int i = 0; i < N; i++) {
//            double peso1 = sc.nextDouble();
//            double peso2 = sc.nextDouble();
//            double peso3 = sc.nextDouble();
//
//            media = (peso1 * 2.0 + peso2 * 3.0 + peso3 * 5.0) / somaPesos;
//
//            System.out.printf("%.1f%n", media);
//        }

//        System.out.println("-----------------------------------------------------");

//        int N = sc.nextInt();
//
//        double divisao;
//        for(int i = 0; i < N; i++) {
//            int numerador = sc.nextInt();
//            int denominador = sc.nextInt();
//
//            if(denominador == 0) {
//                System.out.println("divisão impossível");
//            } else {
//                divisao = (double) numerador / (double) denominador;
//                System.out.println(divisao);
//            }
//
//        }

//        System.out.println("-----------------------------------------------------");
//
//        int N = sc.nextInt();
//
//        int fatorial = 1;
//
//        for(int i = 1; i <= N; i++) {
//            fatorial = fatorial * i;
//
//            if(N == 0) {
//                System.out.println(1);
//            }
//        }
//
//        System.out.println(fatorial);

//        System.out.println("-----------------------------------------------------");
//
//        int N = sc.nextInt();
//
//        for(int i = 1; i < N; i++) {
//            if(N % i == 0) {
//                System.out.println(i);
//            }
//        }

        System.out.println("-----------------------------------------------------");

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.printf("%.0f", Math.pow(i, 2));
            System.out.print(" ");
            System.out.printf("%.0f%n", Math.pow(i, 3));
        }
    }
}
