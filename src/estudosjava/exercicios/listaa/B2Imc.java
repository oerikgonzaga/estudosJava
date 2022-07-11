package estudosjava.exercicios.listaa;

public class B2Imc {

    public static void main(String[] args) {

        double imcErik = calcularIMC(76, 1.76);
        System.out.println(imcErik);

        double imcChibildo = calcularIMC(96, 1.69);
        System.out.println(imcChibildo);
    }
    static double calcularIMC (double peso, double altura){

        return peso / (altura * altura);
    }
}
