package solid.openclose;

public class PriceCalculator {

    private final PriceRuler priceRuler;

    public PriceCalculator(PriceRuler priceRuler) {
        this.priceRuler = priceRuler;
    }

    public double calculateFinalPrice(double actualPrice) {
        return actualPrice + priceRuler.calculateRuleValue(actualPrice);
    }
}
