package Week_10;

public class CourseDetail
{
    public static void main(String[] args)
    {
        OnlineCourse oc1 = new OnlineCourse(47, "jufh", 1256.907, 764.78);
        OfflineCourse fc1 = new OfflineCourse(23, "dsd", 2341.34, 820.32);
        
        System.out.println("Online Course Details :");
        oc1.displayCourse();
        System.out.println("Total Fee : Rs."+oc1.calculateFee());
        System.out.println("");
        
        System.out.println("Offline Course Details :");
        fc1.displayCourse();
        System.out.println("Total Fee : Rs."+fc1.calculateFee());
    }
}