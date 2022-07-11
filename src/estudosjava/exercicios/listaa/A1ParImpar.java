package estudosjava.exercicios.listaa;

import java.util.Scanner;

public class A1ParImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int numero = input.nextInt() % 2;

        String ePar = numero == 0 ? "É par" : "É impar";
        System.out.println(ePar);
    }
}
