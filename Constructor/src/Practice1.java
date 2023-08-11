/*import java.io.*;
import java.lang.Math;
class Employee
{
    static byte size;
    private  int empId;
   private String name;
   private float basicPay;
     float salary;
    public Employee(byte size)
    {
        
        size++;
        /*int min=1;
        int max=10000;
        empId= (int) (Math.random()*(max-min+1)+min);
    }
      public byte readSize() throws IOException
      {
          InputStreamReader isr=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(isr);
          System.out.println("Enter The Size of the Employees to read");
          size=Byte.parseByte(br.readLine());
          return size;
      }
    public void readData() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter The Name of the Employee");
        name=br.readLine();
        System.out.println("Enter The Basic Pay of The Employee");
        basicPay=Float.parseFloat(br.readLine());
    }
    public void calculateSalary()
    {
        float da,hra;
        da=basicPay/2;
        hra=(float)(basicPay*0.1);
        salary=basicPay+da+hra;
    }
    public void display()
    {
        System.out.println("The Name of The Employee is "+name);
        System.out.println("The ID of the Employee is "+empId);
        System.out.println("The Basic Pay of the Employee is "+basicPay);
        System.out.println("The Salary of the Employee is"+salary);
    }
}
public class Practice1 {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Employee obj=new Employee();
        byte size;
        System.out.println("Enter the Size of the array");
        size=Byte.parseByte(br.readLine());
        size= obj.readSize(size);
        Employee[] employeeobj=new Employee[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter The Details for Employee "+(i+1));
            employeeobj[i]=new Employee();
            employeeobj[i].readData();
            employeeobj[i].calculateSalary();
        }
        System.out.println("Displaying the details of Employees");
        for(int i=0;i<size;i++)
        {
            employeeobj[i].display();
        }
    }
}
*/