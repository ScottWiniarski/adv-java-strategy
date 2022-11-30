package discount;

public class SmallDiscount implements DiscountType{
    double percentageRate = .01;

    @Override
    public double discountRate(double billAmount) {
        return billAmount - (billAmount * percentageRate);
    }
}
