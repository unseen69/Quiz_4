package lab1;

public class CourseDemo {
    public static void main(String[] args) {
        Course introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "PROG101");
        introProgramming.setCredits(3.0);

        Course introJava = new IntroJavaCourse(
                "Introduction to Java", "JAVA201");
        introJava.setCredits(3.0);

        Course advancedJava = new AdvancedJavaCourse(
                "Advanced Java", "JAVA301");
        advancedJava.setCredits(4.0);

        System.out.println(introProgramming);
        System.out.println();
        System.out.println(introJava);
        System.out.println();
        System.out.println(advancedJava);

        /*
         * We do not re-declare all properties in each subclass. Common properties
         * (courseName, courseNumber, credits) are declared once in Course and inherited.
         * Only subclass-specific property data (prerequisites) stays in subclasses.
         * getPrerequisites() is abstract in Course because each subclass implements
         * different prerequisite behavior.
         */

        /*
         * Good:
         * The abstract Course superclass reduces duplicated code by placing common
         * fields and shared validation in one place.
         *
         * Bad:
         * If future course types behave very differently, the superclass can become
         * less flexible and may force unrelated subclasses into the same design.
         *
         * Liskov Substitution:
         * Using the abstract type Course is useful when only common behavior is
         * needed. Any subclass object can be used where a Course is expected.
         *
         * It is less useful when subclass-specific behavior is needed, because then
         * the concrete subclass type or a cast may be required.
         */
    }
}