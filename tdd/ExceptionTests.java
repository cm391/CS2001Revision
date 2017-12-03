package tdd;

import common.Account;
import static org.junit.Assert.*;

import common.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTests {
    private Account a;

    @Before
    public void setUpAccount() {
        a = new Account();
        a.deposit(200);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testInsufficientFunds() throws Exception{
        a.withdraw(300);
    }

}
