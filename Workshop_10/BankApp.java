package Workshop_10;

public class BankApp
{
    public static void main(String[] args)
    {
        SA s1= new SA(2334,"Savings_1", 2323.2, 12.2);
        CA c1= new CA(7434,"Current_1", 2304.2);
        
        System.out.println("---------- Saving Account Details ----------");
        System.out.println(s1);
        System.out.println();
        
        System.out.println("---------- Current Account Details ----------");
        System.out.println(c1);
    }
}