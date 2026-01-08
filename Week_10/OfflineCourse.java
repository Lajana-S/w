package Week_10;

public class OfflineCourse extends Course
{
    private double labFee;
    
    public OfflineCourse(int courseId, String courseName, double baseFee, double labFee)
    {
        super(courseId, courseName, baseFee);
        this.labFee = labFee;
    }
    
    @Override //denotes that override is being used in the method
    public double calculateFee()
    {
        return super.baseFee + this.labFee;
    }
}