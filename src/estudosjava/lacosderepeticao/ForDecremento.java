package estudosjava.lacosderepeticao;

public class ForDecremento {

    public static void main(String[] args) {

        int[] listaNumeros = new int[] {3,6,9,18};

        // "i" recebe o tamanho da lista que são 4 numeros
        // como o index começa em 0, utiliza-se o "-1" para igual o tamanho da lista ao tamanho do index
        // index recebe como condição de parada "0" que é a primeira posição do index
        // se a lista começa na posição 3, o decremento, lê em seguida a 2, a 1 e a 0.

        for (int i = listaNumeros.length -1; i >= 0; i--){
            int numeros = listaNumeros[i];
            System.out.println(numeros);
        }
    }
}

class ForDecrementoTexto {

    public static void main(String[] args) {

        String[] listaNomes = new String[] {"Tapioca", "Curau", "Brocolis", "Alfafa"};

        for (int i = listaNomes.length -1; i >= 0; i--){
            String numeros = listaNomes[i];
            System.out.println(numeros);
        }
        System.out.println();
        System.out.println("Saiu do For (do laço de repetição)");

    }
}
