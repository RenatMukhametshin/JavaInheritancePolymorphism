package prj02InheritanceBankAccount.BankAccount;

public class BankAccountCard extends BankAccount {
    public BankAccountCard(double balance, long id) {
        super(balance, id);
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount * 1.01);
    }

    @Override
    public boolean send(BankAccount reciever, double amount) {
        if (getBalance() - 1.01 * amount > 0) {
            withDraw(amount * 1.01);
            reciever.depositMoney(amount);
            return true;
        } else {
            return false;
        }
    }
}
