package prj02InheritanceBankAccount.BankAccount;

import java.util.Calendar;

import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(1000, 5000);
        bankAccount.depositMoney(2500);
        bankAccount.withDraw(500);
        bankAccount.description();
        bankAccount.withDraw(5000);

        BankAccountCard bankAccountCard = new BankAccountCard(3000, 10000);
        bankAccountCard.description();
        bankAccountCard.withDraw(2971);


        BankAccountDeposit bankAccountDeposit = new BankAccountDeposit(10000, 15000);
        bankAccountDeposit.description();
        bankAccountDeposit.withDraw(9000);
        bankAccountDeposit.setDateDepositBlock(2021, JULY,29, 14,31,0);
        bankAccountDeposit.description();
        bankAccountDeposit.withDraw(9000);
        bankAccountDeposit.depositMoney(2000);
        bankAccountDeposit.description();

        System.out.println("\t test send method");
        if(bankAccount.send(bankAccountCard, 500)){
            System.out.println("Success send from " + bankAccount.getId() + " to " + bankAccountCard.getId());
        } else {
            System.out.println("Error send from " + bankAccount.getId() + " to " + bankAccountCard.getId());
        }

        System.out.println();
        if(bankAccount.send(bankAccountDeposit,700)){
            System.out.println("Success send from " + bankAccount.getId() + " to " + bankAccountDeposit.getId());
        } else {
            System.out.println("Error send from " + bankAccount.getId() + " to " + bankAccountDeposit.getId());
        }
        bankAccountDeposit.description();

        System.out.println();
        if(bankAccountDeposit.send(bankAccountCard,2000)){
            System.out.println("Success send from " + bankAccountDeposit.getId() + " to " + bankAccountCard.getId());
        } else {
            System.out.println("Error send from " + bankAccountDeposit.getId() + " to " + bankAccountCard.getId());
        }
        bankAccountCard.description();
        bankAccountDeposit.description();

        System.out.println();
        bankAccountDeposit.setDateDepositBlock(Calendar.getInstance());
        if(bankAccountDeposit.send(bankAccountCard,2000)){
            System.out.println("Success send from " + bankAccountDeposit.getId() + " to " + bankAccountCard.getId());
        } else {
            System.out.println("Error send from " + bankAccountDeposit.getId() + " to " + bankAccountCard.getId());
        }
        bankAccountCard.description();
        bankAccountDeposit.description();


    }
}
