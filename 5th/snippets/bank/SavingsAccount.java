package bank;

import bank.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, String number, int balance) {
        super(name, number, balance);
        this.type = Type.SAVINGS;
    }

    public void display() {
    }

    public int findIntrust() {
        return 0;
    }
}
