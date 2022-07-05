package estruturadecontrole;

public class Switch {

    public static void main(String[] args) {

        String tipoConta = "outros";

        switch (tipoConta){
            case "PF" :
                System.out.println("Conta Pessoa Física");
                break;
            case "PJ" :
                System.out.println("Conta Pessoa Júridica");
                break;
            case "MEI" :
                System.out.println("Conta Micro Empreendedor Individual");
                break;
            default:
                System.out.println("Tipo de Conta não identificada");;
        }
    }
}
