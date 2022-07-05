package estudosjava.lacosderepeticao;

public class WhileDecremento {

    public static void main(String[] args) {

        String[] pessoas = new String[]{"Astolfo", "Deidionson", "Xunynho", "Wuaulison"};

        // 1º Passo - Contador
        int i = pessoas.length;

        // 2º Passo - Condição de Parafa
       while (i >= pessoas.length -1) {
           String nome = pessoas[i];
           System.out.println(nome);
           // 3º Passo - Incremento ou decremento
           i--;
       }
        System.out.println();
        System.out.println("Saiu do Laço / While");
    }
}

class WhileDecrementoNumeros {

    public static void main(String[] args) {

        int[] numeros = new int[]{0,1,2,3,5,8,13,21};

        // 1º Passo - Contador
        int i = numeros.length -1;

        // 2º Passo - Condição de Parafa
        while (i >= 0) {
            int numero = numeros[i];
            System.out.println(numero);
            // 3º Passo - Incremento ou decremento
            i--;
        }
        System.out.println();
        System.out.println("Saiu do Laço / While");
    }
}
