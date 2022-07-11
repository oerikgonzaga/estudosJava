package estudosjava.exercicios.listaa;

import java.util.Scanner;

public class aParImparV2 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double number = input.nextDouble() % 2;

            if (number == 0){
                System.out.println(number + "É par");
            } else System.out.println(number + "É impar");
    }
}
