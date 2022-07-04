package main.java.com.estudojavabasico.bancoaway;

public class financialTransaction {

    void withdraw (Account account, Double value) {
        if (haveBalance(account, value)) {
            account.balance = account.balance - value;
            System.out.printf("%s sacou: %s \n", account.clientName, value);
        } else {
            System.out.printf("%s seu saldo é insuficiente para realizar a saque de %s \n", account.clientName, value);
        }
    }
    void payIn (Account account, Double value){
        account.balance = account.balance + value;
        System.out.printf("%s Você depositou %s Reais, seu saldo é de %s", account.clientName, account.balance, value);
    }
    void transfer(Account originAccount, Account destinyAccount, Double value) {
        if (haveBalance(originAccount, value)){
            withdraw(originAccount, value);
            payIn(destinyAccount, value);
        } else {
            System.out.printf("%s seu saldo é insuficiente para realizar a trânsferencia de %s", originAccount.clientName, value );
        }
    }
    boolean haveBalance(Account account, Double value){
        return account.balance >= value;
    }
}
