package Workshop_10;
import java.util.Scanner;

public class Doctor extends Person
{
    Scanner scan = new Scanner(System.in);
    private String specification;
    private double consultationFee;
    private int emergencyCases;
    private double perEmergency;
    
    public int emergencyCases()
    {
        System.out.println("Enter number of Emergency Cases: ");
        int emergencyCasses = scan.nextInt();
        return emergencyCases;
    }
    
    public double perEmergency()
    {
        System.out.println("Enter the Emergency Cases Rate: ");
        double perEmergency = scan.nextDouble();
        return perEmergency;
    }
    
    public Doctor(int id, String name, double baseSalary, String specification, double consultationFee)
    {
        super(id, name, baseSalary);
        this.specification = specification;
        this.consultationFee = consultationFee;
    }
    
    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + this.consultationFee;
    }
    
    public double calculateSalary(int emergencyCases, double perEmergency)
    {
        double emergency = emergencyCases * perEmergency;
        return super.calculateSalary() + emergency + this.consultationFee;
    }
    
    
    @Override
    public String toString()
    {
        return "----------Doctor Details----------\nDoctor Id :"+super.getId()+"\nDoctor Name : "+super.getName()+"\n Base Salary : Rs."+super.calculateSalary();
    }
}