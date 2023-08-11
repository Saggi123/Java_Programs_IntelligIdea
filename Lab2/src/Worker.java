import java.io.*;
public class Worker {
    String name;
    byte hoursWorked;
    float wage;
    float totalWage;
    float extraWage;
    public void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the worker name");
        name=br.readLine();
        System.out.println("Enter the Number of Hours worked by the worker ");
        hoursWorked=Byte.parseByte(br.readLine());
        System.out.println("Enter The Hourly Wage of the worker");
        wage=Float.parseFloat(br.readLine());
    }
    public void display()
    {
        System.out.println("The name of the worker is : "+name);
        System.out.println("Number of hours worked by the worker is :"+hoursWorked);
        System.out.println("Hourly Wage of the Worker is : "+wage);
        System.out.println("Total wage of the worker is :"+getTotalWage());
    }
    public float calcwg()
    {
       totalWage=wage*hoursWorked;
       return totalWage;
    }
    public float ExtraWage()
    {
        if(calcwg()<200)
         extraWage=150;
        else
            extraWage=50;
        return extraWage;
    }

    public float getTotalWage()
    {
        totalWage=calcwg()+extraWage;
        return totalWage;
    }
    public static void main(String args[]) throws IOException
    {
        Worker worker=new Worker();
        worker.read();
        worker.calcwg();
        worker.ExtraWage();
        worker.getTotalWage();
        worker.display();
    }
}
