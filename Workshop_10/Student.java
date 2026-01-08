package Workshop_10;

public class Student
{
    private int rollno;
    private String name;
    private double marks;
    
    public Student (int rollno, String name, double marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    
    public void setRollno(int newrn)
    {
        this.rollno = newrn;
    }
    
    public int getRollno()
    {
        return this.rollno;
    }
    
    public void setName(String newn)
    {
        this.name = newn;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double calRel()
    {
        return this.marks;
    }
    
    @Override
    public String toString()
    {
        return "Roll No. : "+this.getRollno()+"\nName : "+this.getName();        
    } 
}