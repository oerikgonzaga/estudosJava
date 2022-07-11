package estudosjava.exercicios.listaa;

import java.util.Scanner;

public class B1Imc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }
}
