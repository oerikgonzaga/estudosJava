package main.java.com.estudojavabasico.bancoaway;

public class BankSystem {

    public static void main(String[] args) {
        var financialTransaction = new financialTransaction();

        Account c1 = new Account();
        c1.clientName = "Erik";
        c1.agency = 1;
        c1.number = 369;
        c1.accountType = "Corrente";
        c1.balance = 950.00;

        Account c2 = new Account();
        c2.clientName = "Lorenzo";
        c2.agency = 1;
        c2.number = 367;
        c2.accountType = "Poupança";
        c2.balance = 9500.00;

        c1.showBalance();

        financialTransaction.payIn(c1, 1500.00);

        c1.showBalance();

        financialTransaction.withdraw(c1, 3000.00);
        financialTransaction.withdraw(c1, 1000.00);

        c1.showBalance();

        financialTransaction.transfer(c1,c2,950.00);

        c1.showBalance();
        c2.showBalance();

    }
}
