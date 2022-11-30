package discount;

public class DefaultDiscount implements DiscountType{

    double percentageRate = .05;
    @Override
    public double discountRate(double billAmount) {
        return billAmount - (billAmount * percentageRate);
    }
}
