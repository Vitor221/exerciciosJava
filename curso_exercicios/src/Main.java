import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroSoma1 = sc.nextInt();
        int numeroSoma2 = sc.nextInt();

        int soma = numeroSoma1 + numeroSoma2;

        System.out.println("SOMA = " + soma);

        System.out.println("---------------------------------------------------------");

        double raio = sc.nextDouble();

        double area = Math.PI * (Math.pow(raio, 2));

        System.out.printf("A = %.4f%n", area);

        System.out.println("---------------------------------------------------------");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENÇA = " + diferenca);

        System.out.println("---------------------------------------------------------");

        int numeroFuncionario = sc.nextInt();
        int horasTrabalho = sc.nextInt();
        double recebeHoras = sc.nextDouble();

        double salarioFuncionario = horasTrabalho * recebeHoras;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salarioFuncionario);

        System.out.println("---------------------------------------------------------");

        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        double totalPeca1 = numeroPeca1 * valorPeca1;

        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double totalPeca2 = numeroPeca2 * valorPeca2;

        double totalValor = totalPeca1 + totalPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValor);

        System.out.println("---------------------------------------------------------");

        double A2 = sc.nextDouble();
        double B2 = sc.nextDouble();
        double C2 = sc.nextDouble();

        double triangulo = (A2 * C2) / 2;
        double circulo = Math.PI * Math.pow(C, 2);
        double trapezio = ((A2 + B2) * C2) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A2 * B2;

        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}

