import java.io.*;
import java.util.Scanner;
public class Reverse {
String name;
String reverseName=" ";
public Reverse()
{
    name=" ";
}
public void read()
{
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
}
public void reverse()
{
    int length=name.length();
    for(int i=length-1;i>=0;i--)
    {
        char ch=name.charAt(i);
        reverseName=reverseName+ch;
    }
    System.out.println("the reversed word is "+reverseName);
}
}
public class Reverse
{

}