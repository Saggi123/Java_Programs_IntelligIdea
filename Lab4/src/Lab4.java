import java.io.*;
class BankAccount
{
    private static short numAccounts;
    private long accountNumber;
    private String accountHolderName;
    private float balance;

    public BankAccount()
    {
        accountNumber=0;
        accountHolderName="NA";
        balance=0F;
    }
    public BankAccount(long accountNumber,String accountHolderName,float balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        numAccounts++;
    }
    public void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Please Enter the Account Holder's Name");
        accountHolderName=br.readLine();
        System.out.println("Enter The Account Number");
        accountNumber=Long.parseLong(br.readLine());
        System.out.println("Enter the balance in that account");
        balance=Float.parseFloat(br.readLine());
    }
    public void displayAccountDetails()
    {
        System.out.println("Account Number "+accountNumber);
        System.out.println("Account Holder Name"+accountHolderName);
        System.out.println("The Balance in the Account "+balance);
    }
    public void deposit(float amount)
    {
        balance+=amount;
        System.out.println("Final Amount is "+balance);
    }
    public void withdraw(float amount)
    {
        balance-=amount;
        System.out.println("Final Amount is "+balance);
    }
    public static void  NumberofAccounts()
    {
        numAccounts++;
        System.out.println("Welcome to BankAccounts ");
        System.out.println("We currently Service "+numAccounts+" Accounts");
    }
    static {
        System.out.println("Welcome to the Bank");
        System.out.println("The Customers must of age above 15 years");
    }
    static class Branch
    {
        private  String branchName;
        private String branchAddress;

        public Branch(String branchName,String branchAddress)
        {
            this.branchName=branchName;
            this.branchAddress=branchAddress;
        }
        public void display()
        {
            System.out.println("Branch name "+branchName);
            System.out.println("Branch Address "+branchAddress);
        }

    }
    class Loan
    {
        float interestRate;
        float interestAmount;
        public void loanAmount()
        {
            if(balance>1000F) {
                interestRate = 7;
                 interestAmount = 7 * (balance/100);
            }
              else
            {
                interestRate=10;
                 interestAmount=7 * (balance/100);
            }
        }
        public void display()
        {
            System.out.println("The Interest Amount is "+interestAmount);
        }
    }
}
public class Lab4 {
    public static void main(String args[]) throws IOException
    {

        BankAccount.Branch obj1=new BankAccount.Branch("Sky Walk","Kolkata,Esplanade");
        BankAccount obj2=new BankAccount();
        BankAccount.Loan obj3=obj2.new Loan();
        obj1.display();
        obj2.read();
        obj2.displayAccountDetails();
        obj2.deposit(6000F);
        obj2.withdraw(1000F);
        obj3.loanAmount();
        obj3.display();
        BankAccount.NumberofAccounts();

    }
}
