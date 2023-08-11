import java.util.Scanner;
public class sampleprog1 {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter The Number You Wish to Check");
        int num= myObj.nextInt();
        int  num1, rem;
       /* for (num = 1; num < 9999; num++) {*/
            int sum1=0;
            num1 = num;
            while (num1 > 0) {
                int fact=1;
                rem = num1 % 10;
                    for (int i = 1; i <= rem; i++)
                        fact =fact*i;
                sum1+=fact;
                num1=num1/10;
            }
            if(sum1==num)
                System.out.println("The Number "+num+" is special");
        }
}