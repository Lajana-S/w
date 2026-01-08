package Workshop_10;

public class Account
{
    private int an;
    private String hn;
    private double b;
    
    public Account(int an, String hn, double b)
    {
        this.an = an;
        this.hn = hn;
        this.b = b;
    }
    
    public void setAn(int an)
    {
        this.an = an;
    }
    
    public int getAn()
    {
        return this.an;
    }
    
    public void setHn(String hn)
    {
        this.hn = hn;
    }
    
    public String getHn()
    {
        return this.hn;
    }
    
    public void setB(double b)
    {
        this.b = b;
    }
    
    public double getB()
    {
        return this.b;
    }
    
    public double calInt()
    {
        return this.b;
    }
    
    
    @Override
    public String toString()
    {
        return "Account No. : "+this.getAn()+"\nHolder Name : "+this.getHn()+"\nBalance : Rs."+getB()+"\nInterest Rate : 0%"+"\nInterest : Rs."+calInt();     
    }
}