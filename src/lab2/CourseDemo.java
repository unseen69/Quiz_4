package lab2;

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

        Course[] courses = {introProgramming, introJava, advancedJava};

        for (Course course : courses) {
            System.out.println(course.getCourseDetails());
            System.out.println();
        }

        /*
         * Instruction #2 clarification:
         * We do not re-declare methods in each class because they are shared by
         * the Course interface contract and implemented once per class.
         * We do re-declare fields in each subclass because interfaces cannot hold
         * instance state.
         */

        /*
         * Good:
         * The Course interface provides a common contract and supports
         * polymorphism for all course types.
         *
         * Bad:
         * Interfaces cannot store instance fields, so each subclass still repeats
         * field declarations and some setter/getter code.
         *
         * Liskov Substitution:
         * Liskov Substitution can be used when working with behavior defined by
         * the Course interface, because any implementing class can be used where
         * a Course is expected.
         *
         * It is not possible to rely only on the interface when subclass-specific
         * behavior is needed that is not declared in Course.
         */
    }
}