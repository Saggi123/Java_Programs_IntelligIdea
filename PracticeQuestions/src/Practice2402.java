import java.io.*;
class Text
{
    char[] txt;
    int i=0;

    public Text(int size)
    {
        txt=new char[size];
    }
    void read() throws IOException
    {
        char chartxt;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter The String");
       do
        {
             chartxt=(char)(br.read());
            txt[i++]=chartxt;
        } while (chartxt!='\n');
    }
    char charAt(int pos)
    {
        return txt[pos];
    }
    int length()
    {
        return i;
    }

    int noOfWhiteSpaces()
    {
        int count=0;
        for(int j=0;j<i;j++)
        {
            if(txt[j]==' ')
                count++;
        }
        return count;
    }
    int noOfWords() {
        int count = 0;
        for (int j = 0; j < i; j++) {
            if (txt[j] == ' ' && txt[j + 1] != ' ')
                count++;

        }
        if (txt[0] == ' ')
            return count;
        else
            return count+1;
    }
    int match(char [] txt2,int wordlength)
    {
        //System.out.println(wordlength);
        int l=0;
        while(txt2[l]!='\0') {
            System.out.print(txt2[l]);
            l++;
        }
         System.out.println();
         int count=0;
        int k = 0;
        int countwords=0;

             l=0;count=0;
           while( txt[k]!='\0' )
            { l=0;
                //System.out.print(txt[k]+"-"+txt2[l]);
                while(txt[k]==txt2[l] && txt2[l]!='\0')
                {
                   // System.out.print(txt2[l]);
                    count++;
                    l++;
                    k++;
                }

                if(count==wordlength)
                    countwords++;

                if(txt[k]==' ')
                {
                    count=0;l=0;
                }
            //   System.out.println(count);
             k++;
            }

        return countwords;
    }
  void noOfReapeatedWords()
  {
      System.out.println(length());
      System.out.println(noOfWords());
     int j=0,length=0;
      char[] txt1=new char[100];
      while(j<noOfWords())
      {
          int k=0;
          while(length<length() && txt[length]!=' ')
          {
              txt1[k]=txt[length];
              length++;

           // System.out.print(txt1[k]);
              k++;
          }
          txt1[k]='\0';

          //System.out.println();
          int l=0;

          int countwords=match(txt1,k);
         System.out.println(countwords);
          length++;
          System.out.println();
          j++;
      }


  }

    void display()
    {
        for(int j=0;j<i;j++)
            System.out.print(txt[j]);
    }


}
public class Practice2402 {
public  static void main(String args[]) throws IOException
{
    int size,position,length,count,noWord;
    char ch;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter The Number of characters you wish to enter");
    size=Integer.parseInt(br.readLine());
    Text obj=new Text(size);
    obj.read();
    obj.display();
   /* System.out.println("Enter The Position at which you want the character");
    position=Integer.parseInt(br.readLine());
    ch= obj.charAt(position);
    System.out.println(ch);
    length=obj.length();
    System.out.println("Length of the String is "+(length-1));
    count=obj.noOfWhiteSpaces();
    System.out.println("The Number of white Spaces is "+count);
    noWord=obj.noOfWords();
    System.out.println("No of Words are "+noWord);*/
   obj.noOfReapeatedWords();

}
}
