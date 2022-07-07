package estudosjava.metodos;

/*  São trechos de código invocáveis (executáveis);
    Podemos executar quando e quantas vezes for necessário;
    Usando para isolar, organiza e reaproveitar. */

public class MetodosIntroducao {

    // corpo do método

    public static void main(String[] args) {

        imprimiNome();
    }
    // void não retorna, nesse exemplo:
    // é criado um metodo aonde só exibimos a informação contida dentro do metodo;

    // este Metodo é conhecido como sem Retorno

    static void imprimiNome() {
        System.out.println("Erik Gonzaga");
    }
}
