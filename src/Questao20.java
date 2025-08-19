import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double horas = input.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        double horario = input.nextDouble();

        double salario = horas * horario;
        double ir = salario * 0.11;
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double salarioLiquido = salario-ir-inss-sindicato;

        System.out.println("Você Ganhou o total de " + salario);
        System.out.println("Você Pagou " + inss + " de INSS");
        System.out.println("Você Pagou " + sindicato + " ao sindicato");
        System.out.println("Seu salario liquido foi " + salarioLiquido);

    }
}
