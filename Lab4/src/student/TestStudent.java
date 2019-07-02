package student;

/**
 * Created by Tulin on 9/8/2017.
 */
public class TestStudent {
    public static void main(String args[]) {
        Student s1 = new Student("Mary", "Lake");
        Student s2 = new Student("James", "Sky");
        Student s3 = new Student("Ali", "Ocean");

        s1.addCourse("Math", 4, 'B');
        s1.addCourse("English", 3, 'A');
        s1.addCourse("CS", 4, 'A');
        s1.addCourse("Chemistry", 3, 'B');
        s1.addCourse("Health", 2, 'B');

        s2.addCourse("Math", 4, 'B');
        s2.addCourse("English", 3, 'A');
        s2.addCourse("CS", 4, 'C');
        s2.addCourse("Chemistry", 3, 'C');
        s2.addCourse("Health", 2, 'B');

        s3.addCourse("Math", 4, 'C');
        s3.addCourse("English", 3, 'A');
        s3.addCourse("Health", 2, 'B');
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());


    }
}
