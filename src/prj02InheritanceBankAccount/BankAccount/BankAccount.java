package prj02InheritanceBankAccount.BankAccount;

public class BankAccount {
    private double balance;
    private long id;

    public BankAccount(double balance, long id) {
        this.balance = balance;
        this.id = id;
    }

    public void withDraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("\tID###" + id + " cannot withdraw " + amount + ", balance = " + balance);
        } else {
            balance -= amount;
            System.out.println("\tID###" + id + " withdraw " + amount + ", balance = " + balance);
        }
    }

    public void depositMoney(double amount) {
        this.balance += amount;
        System.out.println("\tID###" + id + " deposit " + amount + " to account, balance = " + balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public void description() {
        System.out.println("\tID###" + id + ", balance##" + balance);
    }

    public boolean send(BankAccount reciever, double amount) {
        if (getBalance() - amount > 0) {
            withDraw(amount);
            reciever.depositMoney(amount);
            return true;
        } else {
            return false;
        }
    }

    public long getId() {
        return id;
    }
}
