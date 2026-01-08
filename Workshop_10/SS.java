package Workshop_10;

public class SS extends Student
{
    private int gm;
    
    public SS(int rollno, String name, double marks)
    {
        super(rollno, name, marks);
    }
    
    public double calRel()
    {
        return super.calRel();
    }
    
    public double calRel(int gm)
    {
        return super.calRel() + gm;
    }
    
    @Override
    public String toString()
    {
        return "Roll No. : "+super.getRollno()+"\nName : "+super.getName();
    }
}