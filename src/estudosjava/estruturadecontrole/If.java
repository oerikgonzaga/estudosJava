package estudosjava.estruturadecontrole;

public class If {

    public static void main(String[] args) {

        //  execução de um bloco de instruções, apenas caso a condição seja atendida:

        int a = 1;
        int b = 1;

        String x = "1";
        String y = "2";

        if(a == b) {
            // Comandos executados caso a condição verdadeira
            System.out.println("a e b, são iguais");
        }
        if (x == y){
            // A condição sendo falsa o comando não é executado
            System.out.println("x e y são iguais");
        }
    }
}
