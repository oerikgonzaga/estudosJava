package main.java.com.estudosJava.metodos;

public class MetodosComRetorno {

    public static void main(String[] args) {

        // Aqui eu invoco o método, para imprimi-lo no terminal

        double resultadoIMC = calcularIMC();
        System.out.println(resultadoIMC);
    }

    // isolando o calculo e retornando o valor do IMC.

    // Aqui crio o método que será invocado lá em cima;

    static double calcularIMC(){
        double peso = 76.0;
        double altura = 1.76;

        // usando var ao invés de double;

        var imc = peso / (altura * altura); // utilizando precedencia matemática pra realização de calculos.
        return imc;
    }
}
