package discount;

public class LargeDiscount implements DiscountType{

    double percentageRate = .75;
    @Override
    public double discountRate(double billAmount) {
        return billAmount - (billAmount * percentageRate);
    }
}
