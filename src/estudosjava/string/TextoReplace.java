package estudosjava.string;

public class TextoReplace {

    public static void main(String[] args) {

        // STRING são imutaveis, sempre vamos usar o operador de atribuição para mudar o seu valor
// STRING = lista de caracteres (Array de Char)

        String texto = "Aula de Programação";
        System.out.println(texto);

// replace - substitui um texto pelo outro

        texto.replace("Programação", "Lógica"); //  Não acontece nada, pois Strings são imutáveis
        texto = texto.replace("Programação", "Lógica");
        texto = texto.replaceAll("", "");

        System.out.println(texto);

    }
}
