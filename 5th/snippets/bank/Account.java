package bank;

public abstract class Account {
    protected String name;
    protected String number;
    public enum Type {
        CURRENT, SAVINGS
    };
    protected Type type;
    protected int balance;

    public Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public abstract void display();
}
