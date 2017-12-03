package tdd;

import common.Account;
import static org.junit.Assert.*;

import common.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

public class AccountTests {
    private Account a;

    @Before
    public void setupAccount() {
        a = new Account();
    }

    private void withdraw(int amount) {
        try {
            a.withdraw(amount);
            assertEquals(-amount, a.getBalance());
        }
        catch (InsufficientFundsException e) {
            System.out.println("You are short by " + e.getAmount());
        }
    }

    @Test
    public void withdrawZero() {
        withdraw(0);
    }

    @Test
    public void withdrawTen() {
        withdraw(10);
    }
}
