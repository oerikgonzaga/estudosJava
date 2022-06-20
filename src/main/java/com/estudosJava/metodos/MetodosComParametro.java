package main.java.com.estudosJava.metodos;

public class MetodosComParametro {

    public static void main(String[] args) {

        System.out.println("IMC do Ronam");
        double calculo1 = calcularIMC(83.0, 1.76);
        System.out.println(calculo1);

        System.out.println(); // espaço entre linhas no terminal

        System.out.println("IMC do Erik");
        double calculo2 = calcularIMC(76.0, 1.75);
        System.out.println(calculo2);
    }
    static double calcularIMC(double peso, double altura){

        return peso / (altura * altura);

        // double imc = peso / (altura * altura);
        // return imc;
    }
}
