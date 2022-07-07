package estudosjava.metodos;

import java.util.Scanner;

public class MetodosComRetorno {

    public static void main(String[] args) {

        // Metodo com Retorno
        // Aqui eu invoco o método, para imprimi-lo no terminal
        // Após a inserção dos dados, me é retornado o resultado IMC

        double resultadoIMC = calcularIMC();
        System.out.println(resultadoIMC);
    }

    // isolando o calculo e retornando o valor do IMC.
    // Aqui crio o método que será invocado lá em cima;

    static double calcularIMC(){

        Scanner input = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = input.nextDouble();

        System.out.print("Altura: ");
        double altura = input.nextDouble();

        // usando var ao invés de double;

        var imc = peso / (altura * altura); // utilizando precedencia matemática pra realização de calculos.
        return imc;
    }
}
