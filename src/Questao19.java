import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Primeira Nota:");
        int valor1 = input.nextInt();
        System.out.println("Segunda Nota:");
        int valor2 = input.nextInt();
        System.out.println("Terceira Nota:");
        int valor3 = input.nextInt();
        System.out.println("Quarta Nota: ");
        int valor4 = input.nextInt();
        int media = (valor1 + valor2 + valor3 + valor4) / 4;
        System.out.println("A média é " + media);
    }
}
