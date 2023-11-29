package be.pxl.h2.oef.oef2;


public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567890",
                "Marlon", 12, 1);
       bankAccount.doOperations(10,90);
        System.out.println(bankAccount.getSaldo());

    }
}
