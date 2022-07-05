package estudosjava.lacosderepeticao;

public class ForString {

    public static void main(String[] args) {

        // Criando um array de String vazio.
        // Este Array contém 10 posições

        String[] pessoas = new String[10];

        // Adicionando Valores.
        pessoas[0] = "Astolfo";
        pessoas[1] = "Benilton";
        pessoas[2] = "Chibildo";
        pessoas[3] = "Deidionson";
        pessoas[4] = "Estupefatum";
        pessoas[5] = "Josicreudo";
        pessoas[6] = "Lamarzildison";
        pessoas[7] = "Setocleniano";
        pessoas[8] = "Xanynho";
        pessoas[9] = "Wuaulison";

        // recuperando o tamanho da Lista
        int tamanhoLista = pessoas.length;

        //Acessando uma posição do Array.
        String nome = pessoas[9];
        System.out.println(nome);
    }
}
