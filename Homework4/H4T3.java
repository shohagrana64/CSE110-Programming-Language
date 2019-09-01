//JAVA code for maximum and average

import java.util.Scanner;

public class H4T3
{
  public static void main(String[]args)
  {
   Scanner input= new Scanner(System.in);
   
   System.out.println("Enter number "+1);
   int num = input.nextInt();
   int max= num, num1,sum= num,avg;
   
   for(int c=1;c<7;c++)
   {
    System.out.println("Enter number "+(c+1));
    num1= input.nextInt();
    sum= sum+num1;
    if(num1>max)
     max= num1;
   } 
   
   avg= sum/7;
   System.out.println("Maximum= "+max+"\nAverage = "+avg);
  }
}
