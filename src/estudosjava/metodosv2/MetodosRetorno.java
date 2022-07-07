package estudosjava.metodosv2;

public class MetodosRetorno {


class MetodosComRetorno {

    public static void main(String[] args) {

        somarComRetorno();
    }
        static double somarComRetorno(){
            double soma = 10.25 + 25.50;
            return soma;
        }
    }


    class MetodosSemRetorno {

        public static void main(String[] args) {

            somarSemRetorno();
        }
        static void somarSemRetorno(){
            double soma = 10.25 + 25.50;
            System.out.println(soma);
        }
    }
}


