import java.io.*;
class Person
{
     String name;
     byte age;
     String gender;
     String address;
     public Person()
     {
          name="NA";
          age=0;
          gender="NA";
          address="NA";
     }
     public Person(String name,byte age,String gender,String address)
     {
          this.name=name;
          this.age=age;
          this.gender=gender;
          this.address=address;
     }
     public void read()
     {
          try
          {
               InputStreamReader isr=new InputStreamReader(System.in);
               BufferedReader br=new BufferedReader(isr);
               System.out.println("Enter The Name");
               name=br.readLine();
               System.out.println("Enter the Age");
               age=Byte.parseByte(br.readLine());
               System.out.println("Enter Your Gender");
               gender= br.readLine();
               System.out.println("Enter the address");
               address= br.readLine();
          }
          catch (Exception e)
          {
               System.out.println(e.toString());
          }
     }
     public void display()
     {
          System.out.println("Name: "+name);
          System.out.println("Age: "+age);
          System.out.println("Gender: "+gender );
          System.out.println("Address: "+address);
     }
}
class Customer extends Person
{
     static int count=0;
     private long acc_No;
     float openingBalance;
     private String pan_no;
     private int cust_id;
     public Customer(String name,byte age,String gender,String pan_no)
     {
          super();
          cust_id=2247;
          count++;
          this.pan_no=pan_no;
          cust_id=cust_id+count;
     }
     public Customer()
     {
          super();
          cust_id=2247;
          count++;
          pan_no="NA";
          cust_id=cust_id+count;
     }
     public void read()
     {
          try{
               super.read();
               InputStreamReader isr=new InputStreamReader(System.in);
               BufferedReader br=new BufferedReader(isr);
               System.out.println("Please Enter Your Account Number");
               acc_No=Long.parseLong(br.readLine());
               System.out.println("Please Enter Your Opening Balance");
               openingBalance=Float.parseFloat(br.readLine());
               System.out.println("Your Pan Number is");
               pan_no= br.readLine();
          }
          catch (Exception e)
          {
               System.out.println(e.toString());
          }
     }
     public void display()
     {
          super.display();
          System.out.println("The Customer Id is "+cust_id);
          System.out.println("The Account Number of the customer is "+acc_No);
          System.out.println("Your Pan_no is "+pan_no);
          System.out.println("The Opening balance of the Account is "+openingBalance);
     }
     public float getopeningBalance()
     {
          return openingBalance;
     }
}
class CustomerAccount extends Customer
{
     public float amount;
     final float minimumBalance=5000F;
     public CustomerAccount(String name,byte age,String gender,String pan_no,float amount)
     {
          super();
          this.amount=amount;
     }
     public CustomerAccount()
     {
          super();
          amount=0;

     }
     public void read()
     {
          try
          {
               super.read();
               InputStreamReader isr=new InputStreamReader(System.in);
               BufferedReader br=new BufferedReader(isr);
               System.out.println("Please Enter The Amount");
               amount=Float.parseFloat(br.readLine());
          }
          catch (Exception e)
          {
               System.out.println(e.toString());
          }
     }
     public void withdraw()
     {
          if(amount<(getopeningBalance()-minimumBalance))
          {
               System.out.println("Money Withdrawn");
               super.openingBalance=super.openingBalance-amount;
               System.out.println("Updated Balance is "+openingBalance);
          }
          else {
               System.out.println("Sorry Money Cannot be withdrawn,amount is large");
          }
     }
     public void deposit()
     {
          System.out.println("Balance before Deposit is "+super.openingBalance);
          super.openingBalance=super.openingBalance+amount;
          System.out.println("Your balance after Deposit is "+super.openingBalance);
     }
     static class Branch
     {
          public static void display()
          {
               System.out.println("Branch:Kolkata");
               System.out.println("Branch Code: Kol2247");
          }

          static {
               System.out.println("Welcome To Dream Branch");
          }
     }
}

public class Question1 {
     public static void main(String args[])
     {
          CustomerAccount.Branch obj1=new CustomerAccount.Branch();
          CustomerAccount.Branch.display();
          CustomerAccount obj[]=new CustomerAccount[3];
          for(byte i=0;i<3;i++)
          {
               obj[i]=new CustomerAccount();
               System.out.println("Entering the Details of the Customer "+(i+1));
               obj[i].read();
          }
          for(byte i=0;i<2;i++)
          {
               obj[i].display();
               obj[i].deposit();
          }
          for (int i=2;i<3;i++)
          {
               obj[i].display();
               obj[i].withdraw();
          }

     }
 }