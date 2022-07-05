package estudosjava.exercicios.listab;

import java.util.Scanner;

public class ExercicioUmV3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Estado: ");
        String estadoInput = input.nextLine();
        String estado = estadoInput.toLowerCase();

        switch (estado) {
            case "acre" -> System.out.println("AC");
            case "alagoas" -> System.out.println("AL");
            case "amapa" -> System.out.println("AP");
            case "amazonas" -> System.out.println("AM");
            case "bahia" -> System.out.println("BA");
            case "ceara" -> System.out.println("CE");
            case "distrito federal" -> System.out.println("DF");
            case "espirito santo" -> System.out.println("ES");
            case "goias" -> System.out.println("GO");
            case "maranhao" -> System.out.println("MA");
            case "mato grosso" -> System.out.println("MT");
            case "mato grosso do sul" -> System.out.println("MS");
            case "minas gerais" -> System.out.println("MG");
            case "paraiba" -> System.out.println("PB");
            case "para" -> System.out.println("PA");
            case "parana" -> System.out.println("PR");
            case "pernambuco" -> System.out.println("PE");
            case "piaui" -> System.out.println("PI");
            case "rio de janeiro" -> System.out.println("RJ");
            case "rio grande do norte" -> System.out.println("RN");
            case "rio grande do sul" -> System.out.println("RS");
            case "rondonia" -> System.out.println("RO");
            case "roraima" -> System.out.println("RR");
            case "santa catarina" -> System.out.println("SC");
            case "sao paulo" -> System.out.println("SP");
            case "sergipe" -> System.out.println("SE");
            case "tocantins" -> System.out.println("TO");
            default -> System.out.println("Erro, Estado inexistente. Verifique a Ortografia.");
        }
    }
}