package Workshop_10;

public class CA extends Account
{
    public CA(int an, String hn, double b)
    {
        super(an, hn, b);
    }
    
    public double calInt()
    {
        return super.calInt();
    }
    
    
    @Override
    public String toString()
    {
        return "Account No. : "+super.getAn()+"\nHolder Name : "+super.getHn()+"\nBalance : Rs."+calInt();
    }
}