package Workshop_10;
import java.util.Scanner;

public class OrderApp
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        NormalOrder no = new NormalOrder(8302, "Normal_1", 10113.25);
        PremiumOrder po = new PremiumOrder(512, "Premium_1", 34111.33);
        
        System.out.println("---------- Normal Order Details ----------");
        System.out.println(no);
        
        System.out.println("");
        
        System.out.println("---------- Premium Order Details ----------");
        System.out.println("Enter the discount rate :");
        double d = s.nextDouble();
        double disAmount = po.calFinalAmount() * d / 100;
        System.out.println(po);
        System.out.println("Total Amount : Rs."+po.calFinalAmount(disAmount));
    }
}