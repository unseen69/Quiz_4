package lab1;

public class AdvancedJavaCourse extends Course {
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        this.prerequisites = "Intro to Java";
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = requireText(prerequisites, "prerequisites");
    }
}