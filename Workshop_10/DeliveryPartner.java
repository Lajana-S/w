package Workshop_10;

public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerId, String name, double basePay)
    {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }
    
    public void setPartnerId(int partnerId)
    {
        this.partnerId = partnerId;
    }
    
    public int getPartnerId()
    {
        return this.partnerId;
    }
    
    public void setName(String Name)
    {
        this.name = Name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double calPay()
    {
        return this.basePay;
    }
    
    
    @Override
    public String toString()
    {
        return "Partner Id : "+this.partnerId+"\nPartner Name : "+this.name+"\nBase Pay : Rs."+calPay();
    }
}