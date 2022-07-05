package main.java.com.estudosJava.lacosderepeticao;

public class While {

    public static void main(String[] args) {

        String[] pessoas = new String[]{"Astolfo", "Deidionson", "Xunynho", "Wuaulison"};

        // 1º Passo - Contador
        int i = 0;

        // 2º Passo - Condição de Parafa
       while (i < pessoas.length) {
           String nome = pessoas[i];
           System.out.println(nome);
           // 3º Passo - Incremento ou decremento
           i++;
       }
        System.out.println();
        System.out.println("Saiu do Laço / While");
    }
}
