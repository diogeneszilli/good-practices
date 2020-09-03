package solid.interfacesegregation;

public class CheckingAccount implements OverdraftableBankAccount {

    @Override
    public double getBalance() {
        return 100d;
    }

    @Override
    public double getOverdraftLimit() {
        return 1000d;
    }
}
