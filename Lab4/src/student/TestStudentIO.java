package student;

import java.io.*;
import java.util.ArrayList;
/**
 * Created by Tulin on 9/8/2017.
 */
public class TestStudentIO
{
    public static void main(String[] args)
    {
        ArrayList <Student> students = new ArrayList();
        String home = System.getProperty("user.home");
        String filePath = home + "/Documents/KSU/Fall 2017/CS 1302/Lab4/src/student/data/";
        try
        {
            File file                     = new File(filePath + "studentGrades.txt");
            FileReader fileReader         = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer     = new StringBuffer();

            String line;

            while ((line = bufferedReader.readLine()) != null)
            {
                File file2  = new File(filePath +line);
                FileReader fileReader2 = new FileReader(file2);
                BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                String line2;
                line = line.substring(0, line.lastIndexOf('.'));
                String[] name = line.split("-");
                String firstName = name[0];
                String lastName = name[1];
                Student student = new Student(firstName, lastName);

                while ((line2 = bufferedReader2.readLine()) != null)
                {
                    String[] array = line2.split(",");
                    String course = array[0];
                    int credit = Integer.parseInt(array[1].trim());
                    char grade = array[2].trim().charAt(0);
                    student.addCourse(course, credit, grade);
                }
                fileReader2.close();

                students.add(student);
            }

            fileReader.close();

            File outputFile = new File(filePath +"grades.txt");

            if (outputFile.exists())
            {
                outputFile.delete( );
            }
            outputFile.createNewFile();

            PrintWriter out = new PrintWriter(outputFile);
            for (int i = 0; i < students.size(); i++)
            {
                Student student = students.get(i);
                ArrayList courses = student.getCourseList();
                double gpa = student.computeGPA(courses);
                String gpaStr = Double.toString(gpa);
                out.println("Student " + student.getFname() + " " + student.getLname() + " has a " + gpaStr + " GPA.");
            }

            out.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
