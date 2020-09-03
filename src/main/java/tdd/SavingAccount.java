package tdd;

public class SavingAccount {

    private int balance;

    public SavingAccount() {
        this.balance = 0;
    }

    public SavingAccount(int amount) {
        this.balance = amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int balance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
