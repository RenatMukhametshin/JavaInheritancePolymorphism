package prj03AbstractExample.clients;

public class Entreprenuer extends Client {
    public Entreprenuer(long idAccount, double balanceAccount) {
        setIdAccount(idAccount);
        setBalanceAccount(balanceAccount);
    }

    @Override
    public void replenishment(double money) {
        if (money < 1000.0) {
            money *= 0.99;
        } else {
            money *= 0.995;
        }
        setBalanceAccount(getBalanceAccount() + money);
    }

    @Override
    public boolean withdrawal(double money) {
        if(getBalanceAccount() >= money){
            setBalanceAccount(getBalanceAccount() - money);
            return true;
        }
        return false;
    }

    @Override
    public void printInfoAccount() {
        System.out.println("\nENTREPRENEUR account ID=" + getIdAccount() + ", balance=" + getBalanceAccount() +
                "\n replenishment=1.0% < 1000 || 0.5% >= 1000.0, withdrawal=0.0%");
    }
}
