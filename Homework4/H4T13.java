//JAVA code for total of odds

import java.util.Scanner;

public class H4T13
{
  public static void main(String[]args)
  {
   Scanner input= new Scanner(System.in);
   
   System.out.println("Enter n");
   int n = input.nextInt();
   int sum= 0;
   for(int c=1;c<=n;c++)
   {
    if(c%2!=0)
     sum= sum+c;   
   }
   System.out.println(sum);
  }
}
