package main.java.com.estudojavabasico.bancoaway;

public class Account {

    Integer number;
    String clientName;
    Integer agency;
    String accountType;
    Double balance;

    void showBalance() {
        String balanceMsg = String.format("%s seu saldo é %s", clientName, balance);
        System.out.println(balanceMsg);
    }
}
