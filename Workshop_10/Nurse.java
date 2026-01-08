package Workshop_10;

public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id, String name, double baseSalary, String shift, double extraAllowance)
    {
        super(id, name, baseSalary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    
    
    @Override
    public String toString()
    {
        return "---------- Nurse Details ----------\nNurse Id : "+super.getId()+"\nNurse Name : "+super.getName()+"\nShift : "+this.shift+"\nStaff Base Salary : Rs."+super.calculateSalary()+"\nTotal Salary : Rs."+calculateSalary();
    }
    
    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + this.extraAllowance;
    }
}