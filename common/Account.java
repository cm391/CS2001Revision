package common;
import common.InsufficientFundsException;

public class Account {
    private static final int LIMIT = 100;
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws InsufficientFundsException{
        if (amount <= balance) {
            balance -= amount;
        } else {
            int needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public Object getBalance() {
        return balance;
    }
}
