package Seatwork;

public class ShopeePay implements paymentMode{
    @Override
    public double determineDiscountRate() {
        return 0.10;
    }
}
