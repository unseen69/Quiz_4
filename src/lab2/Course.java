package lab2;

public interface Course {

    String getCourseName();

    void setCourseName(String courseName);

    String getCourseNumber();

    void setCourseNumber(String courseNumber);

    double getCredits();

    void setCredits(double credits);

    String getPrerequisites();

    default String getCourseDetails() {
        return "Course Name: " + getCourseName()
                + "\nCourse Number: " + getCourseNumber()
                + "\nCredits: " + getCredits()
                + "\nPrerequisites: " + getPrerequisites();
    }

    static void validateRequiredString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    static void validateCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be in the range 0.5 to 4.0");
        }
    }
}