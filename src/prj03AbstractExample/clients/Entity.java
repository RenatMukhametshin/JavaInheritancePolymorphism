package prj03AbstractExample.clients;

public class Entity extends Client {
    public Entity(long idAccount, double balanceAccount) {
        setIdAccount(idAccount);
        setBalanceAccount(balanceAccount);
    }

    @Override
    public void replenishment(double money) {
        setBalanceAccount(getBalanceAccount() + money);
    }

    @Override
    public boolean withdrawal(double money) {
        if (getBalanceAccount() >= money * 1.01) {
            setBalanceAccount(getBalanceAccount() - money * 1.01);
            return true;
        }
        return false;
    }

    @Override
    public void printInfoAccount() {
        System.out.println("\nENTITY account ID=" + getIdAccount() + ", balance=" + getBalanceAccount() +
                "\n replenishment=0.0%, withdrawal=1.0%");
    }
}
