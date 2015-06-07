public abstract class Account {
    public abstract String getType();
}

public class CurrentAccount extends Account implements CurrentInterface {
    public String getType() {
        return accountType;
    }
}

public class SavingsAccount extends Account implements SavingsInterface {
    public String getType() {
        return accountType;
    }
}

public interface CurrentInterface {
    public static final String accountType = "current";
}

public interface SavingsInterface {
    public static final String accountType = "savings";
}
