package lab2;

public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
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
        return "None";
    }
}