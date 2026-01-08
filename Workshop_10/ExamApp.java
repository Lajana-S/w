package Workshop_10;
import java.util.Scanner;

public class ExamApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SS s1 = new SS(213, "Science_1", 78.23);
        MS m1 = new MS(92, "Management_1", 67.22);
        
        System.out.println("------------ Science Student Details ------------");
        System.out.println();
        
        System.out.println("Want to add grace marks? (Y/N)");
        char a = scan.next().charAt(0);
        
        if(a == 'y' || a == 'Y')
        {
            System.out.println("Enter the grace marks :");
            int g = scan.nextInt();
            System.out.println(s1);
            System.out.println("Result : "+s1.calRel());
            System.out.println("Total Result : "+s1.calRel(g));
        }
        else
        {
            System.out.println(s1);
            System.out.println("Result : "+s1.calRel());
            System.out.println("Total Result : "+s1.calRel());
        }
        
        System.out.println();
        
        System.out.println("---------- Management Student Details ----------");
        System.out.println();
        
        System.out.println("Want to add grace marks? (Y/N)");
        a = scan.next().charAt(0);
        
        if(a == 'y' || a == 'Y')
        {
            System.out.println("Enter the grace marks :");
            int g = scan.nextInt();
            System.out.println(m1);
            System.out.println("Result : "+m1.calRel());
            System.out.println("Total Result : "+m1.calRel(g));
        }
        else
        {
            System.out.println(m1);
            System.out.println("Result : "+m1.calRel());
            System.out.println("Total Result : "+m1.calRel());
        }
    }
}