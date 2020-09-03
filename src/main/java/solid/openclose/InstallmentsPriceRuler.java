package solid.openclose;

public class InstallmentsPriceRuler implements PriceRuler {

    @Override
    public double calculateRuleValue(double actualPrice) {
        double txInstallments = 20d;
        double txGateway = 10d;
        return txGateway + txInstallments;
    }
}
