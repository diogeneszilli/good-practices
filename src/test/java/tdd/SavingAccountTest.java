package tdd;

import org.junit.Assert;
import org.junit.Test;

public class SavingAccountTest {

    @Test
    public void checkBalanceAfterDeposit() {
        SavingAccount account = new SavingAccount();
        account.deposit(100);
        Assert.assertEquals("Value check after deposit", 100, account.balance());
    }

    @Test
    public void checkBalanceAfterWithdraw() {
        SavingAccount account = new SavingAccount(100);
        account.withdraw(50);
        Assert.assertEquals("Value check after withdraw", 50, account.balance());
    }

    @Test
    public void withdrawMoreThanHaveInBalance() {
        SavingAccount account = new SavingAccount(100);
        account.withdraw(200);
        Assert.assertEquals("Check amount after try withdraw more money than have in account", 100, account.balance());
    }
}
