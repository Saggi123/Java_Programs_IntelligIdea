import java.io.*;
class Account// A class can static variable and functions which can be referred to as class variable and class functions
{
   String custName;
protected int accNo;
static int acc;
    private float balance;
    Account()
    {
        acc++;
        custName="";
        accNo=-1;
    }
    Account(String custName)
    {
        this.custName=custName;
    }
    Account(String custName,int accNo)
    {
       this(custName);//this() indicates current constructor this(custName) will look for a constructor with custName as
        //parameter and utilise that code. This is known as constructor chaining.
        this.accNo=accNo;
    }
    public void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter Your Name");
        custName=br.readLine();
        System.out.println("Enter Your Account Number");
        accNo=Integer.parseInt(br.readLine());
        System.out.println("Enter Your Balance");
        balance=Float.parseFloat(br.readLine());
    }

    public void display()
    {
        System.out. println("ACC No"+acc);
        System.out.println("Your Customer Name is "+custName);
        System.out.println("Your Account Number is "+accNo);
        System.out.println("Your Balance is "+balance);
    }
}
//super stands for immediate parent class
/*class LoanAccount extends Account
{
    float intRate;
    int amountSanc;
    public LoanAccount()
    {
        super();
        intRate=(float)0.0;
        amountSanc=0;
    }
    public LoanAccount(String custName,int accNo,float intRate,int amount)
    {
        super(custName,accNo);
        this.intRate=intRate;
        this.amountSanc=amount;
    }
    //constructors if not public we cannont invoke that constructor from the main function of another class
    //We can make constructors private provided we create only one object of that class known as singleton objects
    public void read()
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try
        {
            super.read();
            System.out.println("Enter the Interest Rate");
            intRate=Float.parseFloat(br.readLine());
            System.out.println("Enter the Maximum Amount sanctioned");
            amountSanc=Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void display()
    {
        super.display();
        System.out.println("The Interest rate is "+intRate);
        System.out.println("The amount sanctioned is "+amountSanc);
    }
}
class CarLoan extends LoanAccount
{
    String carcomapny;
    String carModel;
    int carCost;

    public CarLoan(String custName,int accNo,float intRate,int amount,String comp,String model,int cost)
    {
        super(custName,accNo,intRate,amount);
        this.carcomapny=comp;
        this.carModel=model;
        this.carCost=cost;
    }
    public CarLoan()
    {
        carcomapny="";
        carModel="";
        carCost=0;
    }
    public void read()
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try
        {
            super.read();
            System.out.println("Enter The Car Company");
            carcomapny= br.readLine();
            System.out.println("Enter The Car Model");
            carModel= br.readLine();
            System.out.println("Enter The Car cost");
            carCost=Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
    public void display() {
       // super.display();
        System.out.println("The Car Company is "+carcomapny);
        System.out.println("The Car Model is "+carModel);
        System.out.println("the accno is "+accNo);
        System.out.println("The Car Cost is "+carCost);
    }
}*/
public class inheritanceexample {
    public static void main(String args[]) {
      Account a2=new Account();
    a2.display();
        /*
        LoanAccount obj = new LoanAccount("Sagnik",989889, 7F,100000);
        obj.display();*/
      /*  CarLoan obj=new CarLoan();
        obj.read();
        obj.display();*/
    }

}
/*In Java we can use Single Inheritance,Multilevel inheritance and hierarchical inheritance
if parent class only one child it is called Single inheritance
if parent has a child class and that child class is a parent to another class then it is called multilevel inheritance
if one parent class has multiple subclasses then it is known as hierarchical inheritance
 Data members if 100 objects are created 100 copies of those members will be created but static variable will have 1 copy for all
 the variables.
 */