package Workshop_10;
import java.util.Scanner;

public class DeliveryApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BikeDelivery b1 = new BikeDelivery(2322, "bike1", 3233.21);
        CarDelivery c1 = new CarDelivery(2311, "car1", 9321.12);
        
        System.out.println("---------- Bike Delivery Details ----------");        
        System.out.println("Any Extra Delivery? (Y/N)");
        char a = scan.next().charAt(0);
        if(a == 'y' || a == 'Y')
        {
            System.out.println("Enter the number of extra order: ");
            int exOrder = scan.nextInt();
            System.out.println(b1);
            System.out.println("Total Payment : Rs."+b1.calPay(exOrder));
        }
        else
        {
            System.out.println(b1);
            System.out.println("Total Payment : Rs."+b1.calPay());
        }
        
        System.out.println();
        
        System.out.println("----------- Car Delivery Details ----------");
        System.out.println("Any Extra Delivery? (Y/N)");
        a = scan.next().charAt(0);
        
        if(a == 'y' || a == 'Y')
        {
            System.out.println("Enter the number of extra order: ");
            int exOrder = scan.nextInt();
            System.out.println(c1);
            System.out.println("Total Payment : Rs."+c1.calPay(exOrder));
        }
        else
        {
            System.out.println(c1);
            System.out.println("Total Payment : Rs."+c1.calPay());
        }
        
    }
}