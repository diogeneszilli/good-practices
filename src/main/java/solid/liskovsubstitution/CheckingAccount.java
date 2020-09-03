package solid.liskovsubstitution;

public class CheckingAccount extends BankAccount {

    @Override
    public double getBalance() {
        return super.getBalance() + getOverdraftLimit();
    }

    public double getOverdraftLimit(){
        return 1000d;
    }
}
