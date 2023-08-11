import java.io.*;
import java.util.Scanner;

class Customer//whenever object is created memory is alloted for the class
{
    private String custName;
    private byte custAge;
    private long acc_No;
    private String gender;
    private short minBal;
    private float bal;
    private boolean pan;
public Customer()// default constructor as there are no parameters given it is known as default constructors
{
    custName="ss";
    custAge=30;
    acc_No=87687;
    gender="Male";
    minBal=2000;
    bal=10000;
    pan=true;
}
public Customer(String custName)
{
    this.custName=custName;//this will have the address of the current object this.custname refers to  the current object's
    //data member custName(or else we can change the name of the argument to cName we can write custName=cName then there is no ambiguity)
    //to access the data members of the current object we can use this
}
public Customer(String custName,long acc_No)
{
    this(custName);//constructors chaining
    this.acc_No=acc_No;
}
    public void read() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Customers Name:");
        custName=br.readLine();

        System.out.println("Enter the Customers Age:");
        custAge=Byte.parseByte(br.readLine());

        System.out.println("Enter the Customers Gender:");
        gender=br.readLine();

        System.out.println("Enter the Customers Account Number:");
        acc_No=Long.parseLong(br.readLine());

        System.out.println("Enter the Customers Minimum Balance:");
        minBal=Short.parseShort(br.readLine());

        System.out.println("Enter the Customers Balance Amount:");
        bal=Float.parseFloat(br.readLine());

        System.out.println("Do you have a Pan Card:");
        pan= Boolean.parseBoolean(br.readLine());
    }

    public void display()
    {
        System.out.println("Customer Name="+custName);
        System.out.println("Age="+custAge);
        System.out.println("Gender="+gender);
        System.out.println("Account Number="+acc_No);
        System.out.println("Minimum Balance="+minBal);
        System.out.println("Total Balance="+bal);
    }
    boolean search(String name)
    {
        boolean f=false;
        if(custName.equals(name))
        {
            f=true;
        }
        return f;
    }
    boolean search(long accountNumber)
    {
        boolean f=false;
        if(acc_No==accountNumber) {
            f = true;
        }
        return f;
    }
}

public class First
{
    public static void main(String[] args)throws IOException
    {
		/*Customer ob1=new Customer();
        Customer ob2=new Customer("Sagnik");
        Customer ob3=new Customer("Sagnik",87776767);

		//ob1.read();
		ob1.display();
        ob2.display();
        ob3.display();*/
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean ch=true;
        byte res,res1,b1;
        Customer obj[]= new Customer[3];

        while(ch)
        {
            System.out.println("1.Read Data");
            System.out.println("2.Display Data");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice");
            res=Byte.parseByte(br.readLine());
            switch(res)
            {
                case 1:
                    for(byte i=0;i<3;i++)
                    {
                        obj[i]= new Customer();
                        obj[i].read();

                    }
                    break;
                case 2:
                    for(byte i=0;i<3;i++)
                    {
                        obj[i].display();

                    }
                    break;
                case 3:
                    ch=false;
            }

        }*/
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        boolean ch=true;
        byte res;
        Customer obj[]=new Customer[3];
        while(ch)
        {
            System.out.println("1 for Read Data");
            System.out.println("2 for displaying data");
            System.out.println("3 for Searching");
            System.out.println("4 to exit");
            System.out.println("Enter your choice");
            res=Byte.parseByte(br.readLine());
            switch (res)
            {
                case 1:
                {
                    for(byte i=0;i<3;i++) {
                        obj[i]=new Customer();
                        obj[i].read();
                    }
                    break;
                }
                case 2:
                {
                    for(byte i=0;i<3;i++)
                        obj[i].display();
                    break;
                }
                case 3:
                {
                    byte res1;
                    System.out.println("1 for Name");
                    System.out.println("2 for Account Number");
                    res1=Byte.parseByte(br.readLine());
                    switch(res1)
                    {
                        case 1: {
                            String sname;
                            byte temp = 0;
                            System.out.println("Enter the name to be searched");
                            sname = br.readLine();
                            for (byte i = 0; i < 3; i++) {
                                if (obj[i].search(sname) == true) {
                                    temp = 1;
                                    obj[i].display();
                                }
                            }
                            if(temp==0)
                                System.out.println("Name not found");
                            break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    ch=false;
                    break;
                }
            }
        }
    }
}
// A Constructor is a function and its name will be same as Class
// iT does not have any return type
//A Constructor need not be invoked
// When a object is created it will be automatically called by the compiler
// When we run the program without calling the read function whatever the value we declared in the Constuctor will be displayed
// If no Constructor is defined the compiler will call a by defeault constructor with its won set of inital values
//Constructor overloading is constructors with same name but different number(or different types) of  parameters this is same for function overloading as well
//BufferedReader class has 2 constructors one is of type (System.in) and the other type is(System.in,size) it will define the size of the buffer to be created
