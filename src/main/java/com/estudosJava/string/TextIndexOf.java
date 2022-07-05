package main.java.com.estudosJava.string;

public class TextIndexOf {

    public static void main(String[] args) {

        // verificando se uma palavra existe dentro de um texto;
        // obs.: palavras maiusculas e minusculas são diferentes para o sistema
        // no Exemplo: "Aula" será reconhecida, porém "aula" não será. Devido ao primeiro char ser minuscula.

        String texto = "Aula de Programação";
        if (texto.indexOf("Aula") != -1) System.out.println("A palavra existe");
    }
}
