package Week_10;

public class OnlineCourse extends Course
{
    private double platformFee;
    
    public OnlineCourse(int courseId, String courseName, double baseFee, double platformFee)
    {
        super(courseId, courseName, baseFee);
        this.platformFee = platformFee;
    }
    
    @Override //denotes that override is being used in the method (run time polymorphism)
    public double calculateFee()
    {
        return super.baseFee + this.platformFee;
    }
}