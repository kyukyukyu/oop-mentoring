package bank;

import bank.Account;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, String number, int balance) {
        super(name, number, balance);
        this.type = Type.CURRENT;
    }

    public void display() {
    }
}
