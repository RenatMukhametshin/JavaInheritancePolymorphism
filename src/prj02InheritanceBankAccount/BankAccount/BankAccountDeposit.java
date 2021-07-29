package prj02InheritanceBankAccount.BankAccount;

import java.util.Calendar;

public class BankAccountDeposit extends BankAccount {
    private Calendar dateDepositBlock;

    public BankAccountDeposit(double balance, long id) {
        super(balance, id);
        dateDepositBlock = Calendar.getInstance();
        dateDepositBlock.add(Calendar.MONTH, 1);
    }

    public void setDateDepositBlock(int year, int month, int date, int hour, int minute, int second) {
        this.dateDepositBlock.set(year, month, date, hour, minute, second);
    }

    public void setDateDepositBlock(Calendar calendar){
        calendar.add(Calendar.MONTH, -1);
        dateDepositBlock = calendar;
    }

    public Calendar getDateDepositBlock() {
        return dateDepositBlock;
    }

    @Override
    public void withDraw(double amount) {
        Calendar currentDateWithDraw = Calendar.getInstance();
        if (dateDepositBlock.getTime().getTime() < currentDateWithDraw.getTime().getTime()) {
            super.withDraw(amount);
        } else {
            System.out.println("\tID###" + getId() + " block withDraw until dateBlock=" + dateDepositBlock.getTime() +
                    ", dateCurrent=" + currentDateWithDraw.getTime());
        }
    }

    @Override
    public void depositMoney(double amount) {
        dateDepositBlock = Calendar.getInstance();
        dateDepositBlock.add(Calendar.MONTH, 1);
        super.depositMoney(amount);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("\tDate Deposit Block: " + dateDepositBlock.getTime());
    }

    @Override
    public boolean send(BankAccount reciever, double amount) {
        if (getBalance() - amount > 0 && dateDepositBlock.getTime().getTime() < Calendar.getInstance().getTime().getTime()) {
            withDraw(amount);
            reciever.depositMoney(amount);
            return true;
        } else {
            return false;
        }
    }
}
