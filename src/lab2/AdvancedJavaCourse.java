package lab2;

public class AdvancedJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        this.prerequisites = "Intro to Java";
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        Course.validateRequiredString(courseName, "course name");
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        Course.validateRequiredString(courseNumber, "course number");
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        Course.validateCredits(credits);
        this.credits = credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        Course.validateRequiredString(prerequisites, "prerequisites");
        this.prerequisites = prerequisites;
    }
}