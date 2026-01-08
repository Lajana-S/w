package Workshop_10;

public class Order
{
    private int orderId;
    private String name;
    private double amount;
    
    public Order(int orderId, String name, double amount)
    {
        this.orderId = orderId;
        this.name = name;
        this.amount = amount;
    }
    
    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }
    
    public int getOrderId()
    {
        return this.orderId;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    public double getAmount()
    {
        return this.amount;
    }
    
    public double calFinalAmount()
    {
        return this.amount;
    }
    
    
    @Override
    public String toString()
    {
        return "Order Id : "+getOrderId()+"\nCustomer Name : "+getName()+"\nAmount : Rs."+getAmount()+"\nFinal Amount : Rs."+calFinalAmount();
    }
}