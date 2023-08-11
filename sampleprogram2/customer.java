import java.io.* ;//all libraries and functions will be imported through this statement(eg java,io.bufferreader)
import java.util.scanner; //java is a package io or util is a sub package
public class Customer // 4 types access specifier are there... first letter of every word of class should be capital
{
    //String minimum takes 10 bytes
    String C_name; //String is a class hence S is capital
    //for identifiers first word first letter would be small subsequent words first letter would be capital eg parseInt
    //class name should be a noun
    // if multiple classes are there and every class has a name we can name the 'name' variable of customer as C_name
    byte age;//because age cannot cross beyond 128
    long int accNo;//because account numbers can be long
    char gender;//M for Male F for Female and T for Third Gender takes 1 byte instead of 10 bytes for String
    short int minBalance;
    float balance;//2 digit precision required for balance
    float total;
    boolean pan;
    //creating a member function
  public void read() throws IOException
  {
      InputStreamReader isr=new InputStreamReader(System.in);  //InputStreamReader is a class and isr is an object of that class
      //new is required when creating an object
      // a constructor has the same name as a class and it is a function
      //InputStreamReader takes arguements of System.in,System is a class .in stands for keyboard whenver something is types through keyboard that will be stored as a variable
      BufferReader br= new BufferReader(isr);// the characters types through keyboard it will be stored in a buffer and then pushed to the cpu isntead of pushing one by one
      //BufferReader br= new BufferReader(isr) whatever is types it will be stored in isr then from there to a buffer and then to cpu

      //Scanner scan = new Scanner(System.in)
      System.out.println(" Enter the Customer Name");
      C_name=br.readLine();
      System.out.println("Enter the customer age");
      age=Byte.parseByte(br.readLine());
      System.out.println("Enter the Customer account Number");
      accNo=Long.parseLong(br.readLine());
      System.out.println("Enter the minimum balance");
      minBalance=Short.parseShort(br.readLine());
  }
  public void display()
  {
      System.out.println("Customer Name ="+C_name);
      System.out.println("Customer age ="+age);
      System.out.println("Customer ")
  }
}
//Functions will have memory allocated in code section
// All data members will have unique memory allocated to each for every object created
// Only one memory will be allocated for each member functions regardless of the number of objects created
// this pointer will hold the address for the current object
//If there are N classes in a file N Class files will be created
//After compilation the .class file created will be known as a byte code