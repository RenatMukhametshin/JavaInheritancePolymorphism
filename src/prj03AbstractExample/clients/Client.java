package prj03AbstractExample.clients;

public abstract class Client {
    private long idAccount;
    private double balanceAccount;

    public abstract void replenishment(double money);

    public abstract boolean withdrawal(double money);

    public abstract void printInfoAccount();

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }
}
