//JAVA code for y=.....n*n series

import java.util.Scanner;

public class H4T6
{
  public static void main(String[]args)
  {
   Scanner input= new Scanner(System.in);
   System.out.println("Enter n");
   int n= input.nextInt();
   int y=0;
   
   for(int c=1;c<=n;c++)
   {
    if(c%2==0)
    y=y-c*c;
    else
    y=y+c*c;  
   }
   System.out.println("y= "+y);
  }
}
