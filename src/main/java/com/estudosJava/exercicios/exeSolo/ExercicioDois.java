package main.java.com.estudosJava.exercicios.exeSolo;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Aulas Semanais Realizadas: ");
        int aulasDadas = input.nextInt();

        System.out.print("Valor por Aula: ");
        double valorAula = input.nextDouble();

        double aulasMes = aulasDadas * 4.5;
        double salarioBase =  aulasMes * valorAula;
        double adicionalHora = valorAula / 100 * 5;
        double remuneracaoTotal = salarioBase + adicionalHora;
        double dsr = remuneracaoTotal / 6;
        double salario = dsr + remuneracaoTotal;

        System.out.println("Seu salario e: " + salarioBase);
        System.out.println("Adicional hora: " + adicionalHora);
        System.out.println("Descanso Semanal Remunerado: " + dsr);
        System.out.println("Total a receber este mes: " + salario);
    }

}
