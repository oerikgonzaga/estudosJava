package main.java.com.estudosJava.exercicios.exeSolo;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do Salario Minimo: ");
        double salarioMinimo = input.nextDouble();

        System.out.print("Informe o consumo em kWh: " );
        double quilowatts = input.nextInt();

        double valorkW = salarioMinimo / 5;
        double valorKWh = quilowatts / valorkW;
        double valorFinal = quilowatts * valorKWh;
        double valorComDesconto = valorFinal - (valorFinal / 100 * 15);

        System.out.println("");
        System.out.println("valor de cada kwh: " + valorKWh);
        System.out.println("");
        System.out.println("O Valor da Conta é: " + valorFinal);
        System.out.println("O Valor da Conta com desconto de 15% é: " + valorComDesconto);
    }
}
