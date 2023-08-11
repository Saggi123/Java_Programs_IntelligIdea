import bank1.Deposit;
import bank1.Withdraw;
import java.io.*;
class Account1{
  final String bankName="SBI";
    String cust_name;
    long acc_no;
    static int acc;

   private float balance;
    Account1()
    {
        cust_name="Sagnik";
        acc++;
        acc_no=acc;
        balance=500020;
    }
    public static void dispstatic(){

        System.out.println(acc);
    }
    Account1(String cust_name)

    {
        this.cust_name= cust_name;
    }

    Account1(String cust_name, long acc_no)
    {

        this(cust_name);
        this.acc_no=acc_no;

    }



    void read() {
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter Your Name");
            cust_name= br.readLine();
            System.out.println("Enter The Account Numbeer");
            acc_no=Long.parseLong(br.readLine());
            System.out.println("Enter The Balance");
            balance=Float.parseFloat(br.readLine());

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    void display()
    {   System.out.println("-------Customer Details------");
        System.out.println("Customer name: " + cust_name);
        System.out.println("Acc_no: " + acc_no);
        System.out.println("Balance: "+ balance);

    }
    public float getBalance()
    {
        return balance;
    }
    public void setBalance(float amt)
    {
        balance=balance-amt;
        System.out.println("The new balance is "+balance);
    }
    public void setBalance1(float amt)
    {
        balance=balance+amt;
        System.out.println("The new balance is "+balance);
    }
}

/*class LoanAccount extends Account1{
    float intRate;
    int amountSanc;
    LoanAccount(){
        super();
        intRate=(float)0.0;
    }

    LoanAccount(String cust_name, int acc_no , float intRate , int amount)
    {
        super(cust_name,acc_no);
        this.intRate = intRate;
        amountSanc =amount;
    }

    void read(){
        Scanner scan1= new Scanner(System.in);
        super.read();
        System.out.println("Enter Interest Rate: ");
        intRate= scan1.nextFloat();
        System.out.println("Enter the  Maximum amount to be sanctioned");
        amountSanc=scan1.nextInt();
    }

    void display(){
        super.display();
        System.out.println("Interest Rate: " + intRate);
        System.out.println("Maximum amount to be sanctioned :" + amountSanc);

    }

}

class CarLoan extends LoanAccount{
    String carCompany;
    String carModel;
    int carCost;
    CarLoan()
    {
        carCompany="Mitsubishi";
        carModel= "Mitsubishi Lancer Evolution VIII MR. .";
        carCost=500000;
    }



    CarLoan(String custName, int accno, float intRate, int amount, String comp, String model, int cost)
    {
        super(custName, accno, intRate, amount);
        carCompany = comp;
        carCost = cost;
    }

    void read(){
        Scanner scanner2 = new Scanner(System.in);
        super.read();
        System.out.println("Enter car company");
        carCompany = scanner2.next();
        System.out.println("Enter car model");
        carModel = scanner2.next();
        System.out.println("Enter car cost");
        carCost = scanner2.nextInt();
    }

    void display(){
        super.display();
        System.out.println("Car Company Name: "+carCompany);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car cost: "+carCost);
    }
}


class inheritance{
    static{
        System.out.println("Hello"); //will be the first thing to get exected before any other objects//
    }
    public static void main(String args[])
    {
         //Account1 a1=new LoanAccount();// a1 is an object of account type point to an instance of Loan account type
        Account1 a2=new CarLoan();//Run time polymorphism if we have two same functions in both Account1 and CarLoan
        //this statement will execute the function of account1;
        //Derived class instance are being assigned to parent class and when the methods are being called it will call the
        //methods of the derived class
        a2.read();
        // a1.read();
        //Account1.dispstatic();
        //obj.read();
        // obj.display();
        //LoanAccount obj1 =new LoanAccount();
    /*CarLoan obj1 = new CarLoan();
    obj1.read();
    obj1.display();

    }

}*/

class SavingsAccount extends Account1 implements Withdraw,Deposit
{
    private float minbalance;
    public void read() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            super.read();
            System.out.println("Enter The Minimum balance");
            minbalance = Float.parseFloat(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
    public void display()
    {
        super.display();
        System.out.println("The Minimum Balance is "+minbalance);
    }
    public void withdraw() {
        float amount=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter The Amount you want to draw");
            amount=Float.parseFloat(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        if(amount<(getBalance()-minbalance))
        {
            System.out.println("Sucess! The amount withdrawn is "+amount);
            setBalance(amount);
        }
        else
        {
            System.out.println("Sorry! Insufficient Balance");
        }
    }
    public void deposit()
    {
        float amount=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter The Amount you want to deposit");
            amount=Float.parseFloat(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

            System.out.println("Sucess! The amount deposited is "+amount);
            setBalance1(amount);
    }
    }

public class inheritance1
{
    public static void main(String args[])
    {
        SavingsAccount obj1=new SavingsAccount();
        obj1.read();
        obj1.display();
        obj1.withdraw();
        obj1.deposit();
    }
}

/* One Interface can extend another interface using extends*/