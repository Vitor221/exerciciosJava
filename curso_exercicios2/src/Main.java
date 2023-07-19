import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String negativo = (a < 0) ? "NEGATIVO" : "NÃO NEGATIVO";

        System.out.println(negativo);

        System.out.println("-----------------------------------------");

        int b = sc.nextInt();

        String parImpar = (b % 2 == 0) ? "PAR" : "IMPAR";

        System.out.println(parImpar);

        System.out.println("-----------------------------------------");

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(B % A == 0) {
            System.out.println("São Múltiplos");
        } else if (A % B == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        System.out.println("-----------------------------------------");

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if(horaInicial > horaFinal) {
            int calcularTempo = 24 - horaInicial + horaFinal;
            System.out.println("O JOGO DUROU " + calcularTempo + " HORA(S)");
        } else if(horaInicial == 0 && horaFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if(horaInicial < horaFinal) {
            int calcularTempo2 =  horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + calcularTempo2 + " HORA(S)");
        }

        System.out.println("-----------------------------------------");

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double totalPedido;

        if(codigo == 1) {
            totalPedido = 4.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", totalPedido);

        } else if(codigo == 2) {
            totalPedido = 4.50 * quantidade;
            System.out.printf("Total: R$ %.2f%n", totalPedido);

        } else if(codigo == 3) {
            totalPedido = 5.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", totalPedido);

        } else if(codigo == 4) {
            totalPedido = 2.00 * quantidade;
            System.out.printf("Total: R$ %.2f%n", totalPedido);

        } else if(codigo == 5) {
            totalPedido = 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f%n", totalPedido);

        } else {
            System.out.println("Não contém esse pedido no cardápio.");
        }

        System.out.println("-----------------------------------------");

        double valor = sc.nextDouble();

        if(valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if(valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25, 50]");
        } else if(valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50, 75]");
        } else if(valor > 75 && valor <= 100){
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        System.out.println("-----------------------------------------");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0 && y > 0) {
            System.out.println("Q1");
        } else if(x < 0 && y > 0) {
            System.out.println("Q2");
        } else if(x < 0 && y < 0) {
            System.out.println("Q3");
        } else if(x > 0 && y < 0) {
            System.out.println("Q4");
        } else if(x == 0 && y == 0) {
            System.out.println("Origem");
        }

        System.out.println("-----------------------------------------");

        double salario = sc.nextDouble();
        double taxaImposto;
        double calcularImposto;

        if(salario >= 0.0 && salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario >= 2000.01 && salario <= 3000.00) {
            taxaImposto = salario - 2000.00;
            calcularImposto = (0.08 * taxaImposto);

            System.out.printf("R$ %.2f%n", calcularImposto);
        } else if(salario >= 3000.01 && salario <= 4500.00) {
            taxaImposto = salario - 3000.00;
            calcularImposto = (0.08 * 1000.00) + (0.18 * taxaImposto);

            System.out.printf("R$ %.2f%n", calcularImposto);
        } else if(salario > 4500.00) {
            taxaImposto = salario - 4500;
            calcularImposto = (0.08 * 1000.00) + (0.18 * 1500) + (0.28 * taxaImposto);

            System.out.printf("R$ %.2f%n", calcularImposto);
        }

    }
}
