import package1.*;
import package1.Deposit;
import package1.Withdraw;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

class Banking
{
   String name;
   private long acc_no;
   float min_balance;
   private float balance;

   public Banking()
   {
       name=" ";
       acc_no=0;
       min_balance=1000;
       balance=0;
   }
   public Banking(String name,long acc_no,float balance)
    {
        this.name=name;
        this.acc_no=acc_no;
        this.balance=1000;
        min_balance=1000;
    }
    public float getBalance()
    {
        return balance;
    }
    public void read()
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try
        {
            System.out.println("Enter Your Name");
            name=br.readLine();
            System.out.println("Enter the account number");
            acc_no=Long.parseLong(br.readLine());
            System.out.println("Enter the present balance in your account");
            balance=Float.parseFloat(br.readLine());
                    
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
    public void display()
    {
        System.out.println("-----Customer Details----");
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
    public void setBalanceDeposit(float amount)
    {
        balance=balance+amount;
        System.out.println("The amount to be Deposited is "+amount);
        System.out.println("New Balance is "+ balance);
    }
    public void setBalanceWihdraw(float amount)
    {
        balance=balance-amount;
        System.out.println("The amount to be withdrawn is "+amount);
        System.out.println("New balance is "+balance);
    }
}


  class Transaction extends Banking implements Deposit, Withdraw
 {
   float amount;

   public void read() {
       try {
           super.read();
           InputStreamReader isr = new InputStreamReader(System.in);
           BufferedReader br = new BufferedReader(isr);
           System.out.println("Enter the Amount");
           amount = Float.parseFloat(br.readLine());
       } catch (Exception e) {
           System.out.println(e.toString());
       }
   }
   public void display()
   {
       super.display();
   }
   public void deposit()
   {
       setBalanceDeposit(amount);
   }
   public void withdraw()
   {
       if(amount<(getBalance()-min_balance))
       setBalanceWihdraw(amount);
       else
       System.out.println("Insufficient Balance");
   }
 }

 class LoanTransaction extends Transaction
 {
     final float interestRate=6.2F;
     float loanAmount=0f;
     float payableback;
     public void read() {
         super.read();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Loan Amount");
         loanAmount = Float.parseFloat(sc.nextLine());
     }
     void calculateLoan()
     {
         payableback=(float)((loanAmount*100)/interestRate)-super.getBalance();
     }
     public void display()
     {
         super.display();
         System.out.println("Amount to be payed after loan "+payableback);
     }
 }
 public class Account {
     public static void main(String[] args) {
         String choice="";
         try
         {
             InputStreamReader isr=new InputStreamReader(System.in);
             BufferedReader br=new BufferedReader(isr);
             choice= args[0];
         }
         catch (Exception e)
         {
             System.out.println(e.toString());
         }
         LoanTransaction obj=new LoanTransaction();
         obj.read();
         if(choice.equals("Withdraw")) {
          System.out.println("aaa");
             obj.withdraw();
             obj.calculateLoan();
             obj.display();
         }
         else if (choice.equals("Deposit")) {
             obj.deposit();
             obj.calculateLoan();
             obj.display();

         }
     }
}
