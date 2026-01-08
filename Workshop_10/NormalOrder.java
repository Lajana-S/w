package Workshop_10;

public class NormalOrder extends Order
{
    public NormalOrder(int orderId, String name, double amount)
    {
        super(orderId, name, amount);
    }
    
    public double calFinalAmount()
    {
        return super.calFinalAmount();
    }
    
    
    @Override
    public String toString()
    {
        return "Order Id : "+super.getOrderId()+"\nCustomer Name : "+super.getName()+"\nTotal Amount : Rs."+calFinalAmount();
    }
}