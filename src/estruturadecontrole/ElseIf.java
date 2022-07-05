package estruturadecontrole;

public class ElseIf {

    public static void main(String[] args) {

        // Com múltiplas condições:

        int a = 1;
        int b = 1;


        if(a > b) {

            // Comandos executados caso a 1ª condição for verdadeira
            System.out.println("a é maior que b");

        } else if (a < b){

            // Comandos executados caso a 2ª condição for verdadeira
            System.out.println("a é menor b");

        } else
            // Comandos executados caso nenhuma das condições for verdadeira.
            System.out.println("a e b são iguais");
    }
}