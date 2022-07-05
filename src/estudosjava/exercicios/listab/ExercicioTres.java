package estudosjava.exercicios.listab;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu ano de Nascimento: ");
        int anoNascimento = input.nextInt();
        System.out.print("Insira o ano Atual: ");
        int anoAtual = input.nextInt();

        int ano2050 = 2050;

        int idadeHoje = anoAtual - anoNascimento;
        int idade2050 = ano2050 - anoNascimento;

        System.out.println();
        System.out.println("Voce completa " + idadeHoje + " anos no Ano atual");
        System.out.println();
        System.out.println("Sua idade em 2050 sera " + idade2050 + " anos");
    }
}
