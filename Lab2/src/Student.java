import java.io.*;
public class Student {
    int rollNo;
    String name;
    String course;
    float percentage;
    byte[] marks = new byte [5];
    short  totalSum;
    public void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the Student name");
        name=br.readLine();
        System.out.println("Enter the Roll Number of the Student");
        rollNo=Integer.parseInt(br.readLine());
        System.out.println("Enter the Course Name ");
        course= br.readLine();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the marks of Subject "+(i+1));
            marks[i]=Byte.parseByte(br.readLine());
        }
    }
    public float calculate()
    {
        for(int i=0;i<5;i++)
            totalSum+=marks[i];
       percentage=(float)totalSum/5;
        return percentage;
    }
    public void display()
    {
        System.out.println("The Name of the Student is :"+name);
        System.out.println("The Roll Number of the Student is :"+rollNo);
        System.out.println("The Course Studies by the Student is :"+course);
        System.out.println("The Percentage of the Student is :"+calculate());
    }
    public static void main(String args[]) throws IOException
    {
        Student student=new Student();
        student.read();
        student.display();
    }
}
