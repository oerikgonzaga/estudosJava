package estudosjava.metodosv2;

import java.time.LocalDateTime;

public class MetodosParametro {

    public static void main(String[] args) {

        // declaraçao de um metodo
        // execução de um metodo (invocar)

class MetodosComParemetro {

    public static void main(String[] args) {

        somarDoisNumeros(10.25, 50.75);

        multiplicarPorDez(25);

    }
        static Double somarDoisNumeros(double n1, double n2) {
            return n1 + n2;
        }
        static Double multiplicarPorDez(double numero) {
            return 10 * numero;
    }
}
    class MetodosSemParametro {

        public static void main(String[] args) {

            exibirHoraAtual();
        }
        static void exibirHoraAtual(){
            System.out.println(LocalDateTime.now());
        }
    }
}}
