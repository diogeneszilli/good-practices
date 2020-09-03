package solid.interfacesegregation;

public interface OverdraftableBankAccount extends BankAccount {

    double getOverdraftLimit();
}
