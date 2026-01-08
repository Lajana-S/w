package Week_10;

public class Course
{
    private int courseId;
    private String courseName;
    protected double baseFee;
    
    public Course(int courseId, String courseName, double baseFee)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.baseFee = baseFee;
    }
    
    public void setCourseId(int newId)
    {
        this.courseId = newId;
    }
    
    public int getCourseId()
    {
        return this.courseId;
    }
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    //method overloading (compile time polymorphism)
    public double calculateFee()
    {
        return this.baseFee;
    }
    
    public double calculateFee(double discountAmount)
    {
        return this.baseFee - discountAmount;
    }
    
    public void displayCourse(){
        System.out.println("Course Id : "+this.courseId);
        System.out.println("Course Name : "+this.courseName);
    }
}