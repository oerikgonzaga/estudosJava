package estudosjava.string;

public class TextIndexOf2 {

    public static void main(String[] args) {

        // recupera a posição do index a partir da palavra
        // caso a palavra não exista retorna -1

        String texto = "Aula de Programação";
        int index = texto.indexOf("Programação");
        System.out.println(index);
    }
}
