package main.java.com.estudosJava.lacosderepeticao;

public class For {

    public static void main(String[] args) {

        // criando um laço de repetição

        // parte 1 (int i = 0)      -> Variavel de Controle
        // parte 2 (i <= 10)        -> Condição de Parada
        // parte 3 (i++)            -> Incremento

        String [] nomes = new String[]{"Chupisco", "Jonys", "Isclauder"};

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            System.out.println(nome);
        }
    }
}
