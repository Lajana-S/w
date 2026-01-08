package Workshop_10;

public class PremiumOrder extends Order
{    
    public PremiumOrder(int orderId, String name, double amount)
    {
        super(orderId, name, amount);
    }
    
    public double calFinalAmount()
    {
        return super.calFinalAmount();
    }
    
    public double calFinalAmount(double disAmount)
    {
        return super.calFinalAmount() - disAmount;
    }
    
    @Override
    public String toString()
    {
        return "Order Id : "+super.getOrderId()+"\nCustomer Name : "+super.getName()+"\nAmount : Rs."+super.getAmount();
    }
}