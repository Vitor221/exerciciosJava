import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while(senha != 2002) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        System.out.println("-------------------------------------------------------------------");

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0) {
            if(x >= 1 && y >= 1) {
                System.out.println("primeiro");
            } else if(x <= -1 && y >= 1) {
                System.out.println("segundo");
            } else if(x <= -1 && y < 0) {
                System.out.println("terceiro");
            } else if(x >= 1 && y <= -1) {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println("-------------------------------------------------------------------");

        int tipoGasolina = sc.nextInt();

        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        while(tipoGasolina != 4) {
            if(tipoGasolina == 1){
                quantidadeAlcool = quantidadeAlcool + 1;

            } else if(tipoGasolina == 2) {
                quantidadeGasolina = quantidadeGasolina + 1;

            } else if(tipoGasolina == 3) {
                quantidadeDiesel = quantidadeDiesel + 1;

            }
            tipoGasolina = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);
    }
}
