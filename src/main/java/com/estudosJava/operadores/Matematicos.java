package main.java.com.estudosJava.operadores;

public class Matematicos {

    public static void main(String[] args) {

        // Operadores Matemáticos
        // + soma,  - subtração,  * multiplicação,  / divisão,  % resto da divisão

        // obs.: geralmente % serve para verficar se um numero é par ou impar

        int a = 1 + 1;
        int b = 2 - 1;
        int x = 2 * 5;
        int y = 5 / 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

        int n = 2;

        if (n % 2 == 0){
            System.out.println(n + " é Par");
        } else System.out.println(" é Impar");

        System.out.println(a + b + x + y + n);
    }
}
