package student;

import java.util.ArrayList;

/**
 * Created by Tulin on 9/8/2017.
 */
public class Student extends Course
{
    private String fname;
    private String lname;
    private ArrayList <Course> course;

    public Student(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
        course     = new ArrayList <>();
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public ArrayList <Course> getCourseList()
    {
        return course;
    }

    public void addCourse(String courseName, int creditHours, char letterGrade)
{
    Course temp = new Course(courseName, creditHours, letterGrade);
    course.add(temp);
}

    @Override
    public String toString()
    {
       return "Student " + getFname() + " " + getLname() + " has a " + computeGPA(course) + " GPA.";
    }
}

