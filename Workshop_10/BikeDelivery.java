package Workshop_10;

public class BikeDelivery extends DeliveryPartner
{    
    private int exOrder;
    public BikeDelivery(int partnerId, String name, double basePay)
    {
        super(partnerId, name, basePay);
    }
    
    public double calPay()
    {
        return super.calPay();
    }
    
    public double calPay(int exOrder)
    {
        return super.calPay() + (500 * exOrder);
    }
    
    public String toString()
    {
        return "Partner Id : "+super.getPartnerId()+"\nPartner Name : "+super.getName()+"\nBase Pay : Rs."+super.calPay();
    }
}