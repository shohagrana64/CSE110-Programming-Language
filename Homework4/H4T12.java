//JAVA code for total and average

import java.util.Scanner;

public class H4T12
{
  public static void main(String[]args)
  {
   Scanner input= new Scanner(System.in);
   
   System.out.println("Enter number "+1);
   int num = input.nextInt();
   int num1,sum,avg,count;
   if(num%4==0)
   {
     sum= num;
     count=1;
   }
   else
   {
     sum= 0;
     count=0;
   }
   for(int c=1;c<=9;c++)
   {
    System.out.println("Enter number "+(c+1));
    num1= input.nextInt();
    if(num1%4==0)
    {  
     sum= sum+num1;
     count++;
    }   
   }
   avg= sum/count;
   System.out.println("Total= "+sum+"\nAverage = "+avg);
  }
}
