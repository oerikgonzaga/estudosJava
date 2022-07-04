package main.java.com.estudosJava.exercicios.exeSolo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUmV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Estado: ");
        String estadoInput = input.nextLine();

        String estado = estadoInput.toLowerCase();

        if (estado.equals("acre")) {
            System.out.println("AC");
        } else if (estado.equals("alagoas")) {
            System.out.println("AL");
        }else if (estado.equals("amazonas")) {
            System.out.println("AC");
        }else if (estado.equals("bahia")) {
            System.out.println("BA");
        }else if (estado.equals("ceara")) {
            System.out.println("CE");
        }else if (estado.equals("distrito federal")) {
            System.out.println("DF");
        }else if (estado.equals("espirito santo")) {
            System.out.println("ES");
        }else if (estado.equals("goias")) {
            System.out.println("GO");
        }else if (estado.equals("maranhao")) {
            System.out.println("MA");
        }else if (estado.equals("mato grosso")) {
            System.out.println("MT");
        }else if (estado.equals("mato grosso do sul")) {
            System.out.println("MS");
        }else if (estado.equals("minas gerais")) {
            System.out.println("MG");
        }else if (estado.equals("para")) {
            System.out.println("PA");
        }else if (estado.equals("paraiba")) {
            System.out.println("PB");
        }else if (estado.equals("parana")) {
            System.out.println("PR");
        }else if (estado.equals("pernambuco")) {
            System.out.println("PB");
        }else if (estado.equals("piaui")) {
            System.out.println("PI");
        }else if (estado.equals("rio de janeiro")) {
            System.out.println("RJ");
        }else if (estado.equals("rio grande do norte")) {
            System.out.println("RN");
        }else if (estado.equals("rio grande do sul")) {
            System.out.println("RS");
        }else if (estado.equals("rondonia")) {
            System.out.println("RO");
        }else if (estado.equals("roraima")) {
            System.out.println("RR");
        }else if (estado.equals("santa catarina")) {
            System.out.println("SC");
        }else if (estado.equals("sao paulo")) {
            System.out.println("SP");
        }else if (estado.equals("sergipe")) {
            System.out.println("SE");
        }else if (estado.equals("tocantins")) {
            System.out.println("TO");
        } else {
                System.out.println("Erro, Estado inexistente. Verifique a Ortografia.");
        }
    }
}