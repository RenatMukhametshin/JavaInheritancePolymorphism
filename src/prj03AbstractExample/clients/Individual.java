package prj03AbstractExample.clients;

public class Individual extends Client {
    public Individual(long idAccount, double balance) {
        setIdAccount(idAccount);
        setBalanceAccount(balance);
    }

    @Override
    public void replenishment(double money) {
        setBalanceAccount(getBalanceAccount() + money);
    }

    @Override
    public boolean withdrawal(double money) {
        if (getBalanceAccount() >= money) {
            setBalanceAccount(getBalanceAccount() - money);
            return true;
        }
        return false;
    }

    @Override
    public void printInfoAccount() {
        System.out.println("\nINDIVIDUAL account ID=" + getIdAccount() + ", balance=" + getBalanceAccount() +
                "\n replenishment=0.0%, withdrawal=0.0%");
    }
}
