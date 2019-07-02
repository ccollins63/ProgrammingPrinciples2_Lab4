package student;

import java.util.ArrayList;

public class Course
{
    protected String courseName;
    protected int creditHours;
    protected char letterGrade;

    public Course()
    {
    }

    public Course(String courseName, int creditHours, char letterGrade)
    {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.letterGrade = letterGrade;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public int getCreditHours()
    {
        return creditHours;
    }

    public void setCreditHours(int creditHours)
    {
        this.creditHours = creditHours;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade)
    {
        this.letterGrade = letterGrade;
    }

    public double computeGPA(ArrayList <Course> courseList)
    {
        int totalCreditHours    = 0;
        double totalGradePoints = 0.0;

        for(int i = 0; i < courseList.size(); i++)
        {
            Course courseSelected = courseList.get(i);
            int creditHours       = courseSelected.getCreditHours();
            totalCreditHours     += creditHours;

            char letterGrade      = courseSelected.getLetterGrade();
            double grade;

            switch(letterGrade)
            {
                case 'A':
                {
                    grade = 4.00;
                    break;
                }
                case 'B':
                {
                    grade = 3.00;
                    break;
                }
                case 'C':
                {
                    grade = 2.00;
                    break;
                }
                case 'D':
                {
                    grade = 1.00;
                    break;
                }
                default:
                {
                    grade = 0.00;
                    break;
                }
            }
            totalGradePoints += (grade * creditHours);
        }

        double gpa = (totalGradePoints / totalCreditHours);
        return Math.round(gpa * 100.D) / 100.D;
    }

    public String toString()
    {
        return "Course Name: " + getCourseName () + "\nCredit Hours: " + getCreditHours () + "\nLetter Grade: " + getLetterGrade ();
    }
}