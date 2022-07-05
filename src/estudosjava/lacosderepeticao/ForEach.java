package estudosjava.lacosderepeticao;

public class ForEach {

    public static void main(String[] args) {

        String[] listaNomes = new String[]{"Chibildo", "Josicreudo", "Lamarzildison", "Setocleniano"};

        // Percorre um array

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
