package Workshop_10;

public class CarDelivery extends DeliveryPartner
{
    private int exOrder;
    public CarDelivery(int partnerId, String name, double basePay)
    {
        super(partnerId, name, basePay);
    }
    
    public double calPay()
    {
        return super.calPay();
    }
    
    public double calPay(int exOrder)
    {
        return super.calPay() + (600 * exOrder);
    }
    
    public String toString()
    {
        return "Partner Id : "+super.getPartnerId()+"\nParent Name : "+super.getName()+"\nBase Pay : Rs."+super.calPay();
    }
}