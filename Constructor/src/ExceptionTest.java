import java.io.*;
class Account11
{

    final String bankName="SBI";
    String custName;
    private int accno;
    private float balance;
    public Account11()
    {
        custName="";
        accno=-1;
    }
    public Account11(String custName)
    {
        this.custName=custName;

    }
    public Account11(String custName, int accno)
    {
        this(custName); // constructor chaining
        this.accno=accno;

    }

    public void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //try
        //{
        System.out.println("\nEnter the Customer Name");

        custName=br.readLine();
        System.out.println("\n Enter the Account Number");
        accno=Integer.parseInt(br.readLine());
        System.out.println("\nEnter the Balance");
        balance=Float.parseFloat(br.readLine());
	/*	}
	   catch(IOException e)
		   {
		   System.out.println(e.toString());
		   }*/
    }
    public void disp()
    {
        System.out.println("ACustomer Name ="+custName);
        System.out.println("Account Number ="+accno);
        System.out.println("Balance Amount ="+balance);

    }
}

public class ExceptionTest
{

    public static void main(String args[]) //throws IOException
    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try
        {
        Account11 obj = new Account11();
        obj.read();
	}
	catch(IOException e)
	{
	}
        int a[] = new int[2];
        String str = null;
        int b,c,d;
        try
        {
            b=Integer.parseInt(br.readLine());
            c=Integer.parseInt(br.readLine());
            d=b/c;

            System.out.println("Access element three :" + a[3]);
            System.out.println(str.length());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown  ArrayIndex:" + e);
        }
        catch(IOException e)
        {
            System.out.println("IOException caught");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arrithmetic");
        }
        System.out.println("Hello");

//catch(Exception e)
//{
        //System.out.println("Exception thrown  : " + e);

//}
/*
	  catch(NullPointerException e)
	  {
	  System.out.println("Exception thrown  NullPointer: " + e);

	  }
	  catch(NumberFormatException e)
	  {
		System.out.println("Exception thrown  Number format Exception: " + e);

	  }
	  catch(IOException e)
	  {
		 System.out.println("Exception thrown  IOException: " + e);

	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Exception thrown  ArithmeticException : " + e);

	  }
	  finally
	  {
		System.out.println("In the final block");

	  }
	   System.out.println("Code after exception");
	*/
    }
}
