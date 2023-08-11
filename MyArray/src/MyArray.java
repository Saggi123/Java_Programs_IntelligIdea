import java.io.*;
public class MyArray {
    int arr[];
    int n;//size of the array
    int highestNumber;//to store the highest number of the array
    int smallestNumber;//to store the smallest number of the array
public MyArray(int size)
{
    arr=new int[size];
    n=size;
}
public void read() throws IOException
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter element : "+(i+1));
        arr[i]=Integer.parseInt(br.readLine());
    }
}
public void display()
{
    for(int i=0;i<n;i++)
    {
        System.out.println("element: "+(i+1)+" "+arr[i]);
    }
}
int gethighestNumber()
{
    highestNumber=arr[0];
    for (int i=1;i<n;i++)
    {
        if(arr[i]>highestNumber)
            highestNumber=arr[i];
    }
    return highestNumber;
}
int getSmallestNumber()
{
    smallestNumber=arr[0];
    for(int i=1;i<n;i++)
    {
        if(arr[1]<smallestNumber)
            smallestNumber=arr[i];
    }
    return smallestNumber;
}
int isReapeat(int a)
{
    int count=-1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==a) {
              count++;
        }
    }
    if(count>=1)
        return 1;
    else
        return 0;
}

int repeatedElementCount(int a)
{
    int repeatCount=0;
  for(int i=0;i<n;i++)
  {
      if(arr[i]==a)
          repeatCount++;
  }
  return (repeatCount-1);
}
void showRepeatedNumbers()
{
    int showRepeat[]=new int[n];
    boolean test;
    int k=0;
    for(int i=0;i<n;i++)
    {
        test=false;
       if(this.isReapeat(arr[i])==1)
       {
           for(int j=0;j<k;j++)
           {
               if(arr[i]==showRepeat[j])
                   test=true;
           }
           if(!test )
           {
               showRepeat[k++]=arr[i];
           }
       }

    }
    for(int i=0;i<k;i++)
        System.out.println(showRepeat[i]);
}
public static void main(String args[]) throws IOException
{
    MyArray obj1=new MyArray(5);
    obj1.read();
    obj1.display();
    int largest=obj1.gethighestNumber();
    System.out.println("The highest Number is "+largest);
    int smallest=obj1.getSmallestNumber();
    System.out.println("The smallest Number is "+smallest);
    int repeatCheck=obj1.isReapeat(1);
    if(repeatCheck==1)
        System.out.println("The Elements 1 is repeated in the array");
    else
        System.out.println("The element 1 is not repeated in the array");
    int repeatCountCheck=obj1.repeatedElementCount(3);
    System.out.println("The Element 3 is repeated "+repeatCountCheck+" times");
    obj1.showRepeatedNumbers();
}
}
