package estudosjava.operadores;

public class Condicional {

    public static void main(String[] args) {

        // Operadores condicionais retornam TRUE ou FALSE
        // Operadores Lógicos: && ( e )   /  ||  ( ou )

        int idade1 = 10;
        int idade2 = 20;

        if (idade1 > 18 && idade2 > 18){  // retorna: false
            System.out.println("Maiores de Idade");
        }
        if (idade1 > 18 || idade2 > 18){ // retorna: true
            System.out.println("Menor Acompanhado");
        }
    }
}
