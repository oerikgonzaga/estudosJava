package estruturadecontrole;

public class Else {

    public static void main(String[] args) {

        // execução de um bloco de instruções, caso a condição seja atendida, e com um fluxo alternativo para os casos de condição não atendida:

        int a = 1;
        int b = 2;

        if(a == b) {
            // Comandos executados caso a condição verdadeira
            System.out.println("a e b, são iguais");
        } else
            // // Comandos executados caso a condição falsa
            System.out.println("a e b não são iguais");
        }
    }
