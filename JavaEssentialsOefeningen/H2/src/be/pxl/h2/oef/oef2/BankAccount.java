package be.pxl.h2.oef.oef2;

public class BankAccount {
    private String bankAccountNumber;
    private String name;
    private double saldo;
    private double rente;

    public BankAccount() {
        this("geen", "onbekend", 0, 1.2);
    }

    public BankAccount(String bankAccountNumber, String name, double saldo,
                       double rente) {
        this.bankAccountNumber = bankAccountNumber;
        this.name = name;
        setSaldo(saldo);
        setRente(rente);
    }

    private void setSaldo(double newSaldo) {
        if (validateAccount()) {
            this.saldo += newSaldo >= 0 ? newSaldo : 0;
            double rente = calcRente();
            this.saldo += rente;
        }
    }


    private boolean validateAccount() {
        if (!(this.bankAccountNumber.length() == 10) || !(this.name.length() > 2)) {
            System.out.println("You can't do any operations if your " +
                    "bankaccount or name is not filled in.");
            return false;
        }
        return true;
    }

    public void setRente(double newRente) {
        this.rente = newRente >= 0 ? newRente : 0;
    }

    private double calcRente() {
        return this.saldo * (this.rente/100);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void deposit(double amount) {
        setSaldo(amount);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("You can't deposit a negative amount.");
            return;
        }
        if (this.saldo == 0) {
            System.out.println("You can't deposit any money. Balance is 0.");
        } else if (this.saldo <= amount) {
            System.out.println("You can only withdraw " + this.saldo +
                    ". " +
                    this.saldo + " will be withdrawn from your " +
                    "account"
            );
            setSaldo(0);
        } else {
            setSaldo(this.saldo -= amount);
        }
    }

    public void doOperations(double... operations) {
        for (double operation : operations) {
            if (operation > 0) {
                deposit(operation);
            } else {
                withdraw(-operation);
            }
        }

    }
}
