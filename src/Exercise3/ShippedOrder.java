package Exercise3;

public class ShippedOrder extends Order
{
    protected static final double SHIPPING_CHARGE = 4.00;
    @Override
    public void computePrice()
    {
        super.computePrice();
        this.totalPrice += SHIPPING_CHARGE;
    }
}
