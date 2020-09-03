package solid.interfacesegregation;

public class SavingsAccount implements ProfitableBankAccount {

    @Override
    public double getProfitRate() {
        return 8d / 100d;
    }

    @Override
    public double getBalance() {
        return 10000d;
    }
}
