package estudosjava.lacosderepeticao;

public class ForArray {

    public static void main(String[] args) {

        // obs.: A primeira posição do index é 0 (zero)

        // Criando um Array com valores

        int[] numeros = new int[] {3,6,9,18};

        // exibindo dados de uma lista com for

        for (int i = 0; i < numeros.length; i++){
            int numero = numeros[i];
            System.out.println(numero);
        }
    }
}
