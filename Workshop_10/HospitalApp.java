package Workshop_10;
import java.util.Scanner;

public class HospitalApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Doctor d1 = new Doctor(323, "doc1",8231.12, "brain", 1223.23);
        Nurse n1 = new Nurse(93, "nur1", 4272.11, "Day", 822.33);
        
        System.out.println("Does the doctor take emergency cases? (Y/N)"); 
        char a = scan.next().charAt(0);
        if(a == 'Y' || a == 'y')
        {
            System.out.println("Enter the number of emergency cases :");
            int em = scan.nextInt();
            System.out.println("Enter the rate of emergency case:");
            double pem = scan.nextDouble();
            System.out.println(d1);
            System.out.println("Salary : Rs."+d1.calculateSalary(em,pem));
        }
        else
        {
            System.out.println(d1);
            System.out.println("Salary : Rs."+n1.calculateSalary());
        }
        
        System.out.println();
        
        System.out.println(n1);
        
    }
}