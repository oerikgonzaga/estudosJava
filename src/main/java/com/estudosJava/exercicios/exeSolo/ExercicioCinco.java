package main.java.com.estudosJava.exercicios.exeSolo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o Valor de Fabrica: ");
        double precoFabrica = input.nextDouble();
        System.out.print("Informe o Percentual sobre a Venda: ");
        double lucroDistribuidor = precoFabrica / 100 * input.nextDouble();
        System.out.print("Informe o percentual das custas dos Impostos: ");
        double percentualImposto = precoFabrica / 100 * input.nextDouble();

        System.out.println("Lucro Distribuidor: " + lucroDistribuidor);
        System.out.println();
        System.out.println("Impostos: " + percentualImposto);
        System.out.println();
        System.out.println("Valor total do Veículo: " + (precoFabrica + lucroDistribuidor + percentualImposto));
    }
}
