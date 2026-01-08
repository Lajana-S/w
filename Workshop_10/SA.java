package Workshop_10;

public class SA extends Account
{
    private double rate;
    
    public SA(int an, String hn, double b, double rate)
    {
        super(an, hn, b);
        this.rate = rate;
    }
    
    public double calInt()
    {
        return super.calInt();
    }
    
    public double calInt(double rate)
    {
        return super.calInt() + (this.rate * super.calInt());
    }
    
    
    @Override
    public String toString()
    {
        return "Account No. : "+super.getAn()+"\nHolder Name : "+super.getHn()+"\nBalance : Rs."+super.getB()+"\nInterest Rate : "+this.rate+"%"+"\nTotal Balance : Rs."+calInt(rate);
    }
}