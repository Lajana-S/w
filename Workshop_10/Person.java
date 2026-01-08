package Workshop_10;

public class Person
{
    private int id;
    private String name;
    private double baseSalary;
    
    public Person(int id, String name, double baseSalary)
    {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public int getId()
    {
        return this.id;
    }
        
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    @Override
    public String toString()
    {
        return "----------Staff Details----------\nStaff Id :"+this.id+"\nStaff Name : "+this.name+"\nStaff Base Salary : Rs."+this.calculateSalary();
    }
  
    public double calculateSalary()
    {
        return this.baseSalary;
    }
}