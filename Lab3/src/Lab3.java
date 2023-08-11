import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
class Person {
  String firstName;
  String lastName;
  String date1;
  String address;
  long phone;
  String email;

  public Person() {
    firstName = "NA";
    lastName = "NA";
    date1 = " NA";
    address = "NA";
    phone = 0;
    email = " ";
  }

  public Person(String firstName, String lastName, String date1, String address, String email) throws Exception {
    this.lastName = lastName;
    this.firstName = firstName;
    this.date1=date1;
    this.address = address;
    this.email = email;
    this.phone = 0;
  }

  public void read() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {
      System.out.println("Enter The First Name");
      firstName = br.readLine();
      System.out.println("Enter The Last Name");
      lastName = br.readLine();
      System.out.println("Enter Your Date");
      date1 = br.readLine();
      System.out.println("Enter Your Phone Number");
      phone = Long.parseLong(br.readLine());
      System.out.println("Enter The Email ");
      email = br.readLine();
    }
    catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  public void display()  throws Exception
  {
    System.out.println("Your FirstName is"+firstName);
    System.out.println("Your LAst Name is"+lastName);
    Date d1=new SimpleDateFormat("dd/MM/YYYY").parse(date1);
    System.out.println("Your Date of Birth is "+d1);
    System.out.println("Your Phone Number is "+phone);
    System.out.println("Your Email id is"+email);
  }
}

class Customer extends Person {
  int customerId;
  long accNo;
  float balance;
  String accountType;

  public Customer() {
    super();
    customerId = 0;
    accNo = 0;
    balance = 0F;
    accountType = "NA";

  }

  public void read() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {
      super.read();
      System.out.println("Enter the Customer ID");
      customerId = Integer.parseInt(br.readLine());
      System.out.println("Enter The Account Number");
      accNo=Long.parseLong(br.readLine());
      System.out.println("Enter The Balance");
      balance=Float.parseFloat(br.readLine());
      System.out.println("Enter The Account type");
      accountType=br.readLine();

    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  public void display() throws Exception
  {
    super.display();
    System.out.println("The Customer Id is "+customerId);
    System.out.println("The Account Number is "+accNo);
    System.out.println("The balance is "+balance);
    System.out.println("The Account Type is "+accountType);
  }
  public void getInterest(String accountType,float balance)
  {
    float interest;
    if(accountType.equals("Savings"))
    {
      System.out.println("The Interest rate for Savings Account is 9%");
      interest=((float)9/100)*balance;
      System.out.println("Your Current yearly Interest is"+interest);
    }
    if(accountType.equals("recuring"))
    {
      System.out.println("Your Quarterly Interest rate is 5%");
      interest=(5F/100)*balance;
      System.out.println("Your Interest every 4 months is "+interest);
    }
  }
  public void getInterest(String accountType)
  {
    float interest;
    if(this.balance<10000)
    {
      System.out.println("Your Interest rate is 6%");
      interest=((float)6/100)*(this.balance);
    }
    else {
      System.out.println("Your Interest Rate is 8%");
      interest=((float)8/100)*this.balance;
      System.out.println("Your Interest is"+interest);
    }
  }
}
public class Lab3
{
  public static void main(String args[]) throws Exception
  {
    Customer obj1=new Customer();
    obj1.read();
    obj1.display();
    obj1.getInterest("recuring",80000F);

  }
}
