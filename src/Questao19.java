import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Primeira Nota:");

        double valor1 = input.nextDouble();
        System.out.println("Segunda Nota:");

        double valor2 = input.nextDouble();
        System.out.println("Terceira Nota:");

        double valor3 = input.nextDouble();
        System.out.println("Quarta Nota: ");

        double valor4 = input.nextDouble();
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.println("A média é " + media);
    }
}
