package solid.liskovsubstitution;

public class AccountCalculator {

    public double getValueAvailable(BankAccount bankAccount){
        return bankAccount.getBalance();
    }
}
