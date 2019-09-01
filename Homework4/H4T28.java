//JAVA code for counting sum of factors

import java.util.Scanner;

public class H4T28
{
 public static void main(String[]args)
 {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a number");
  int n= input.nextInt();
  int s=0;
  for(int i=1;i<=n;i++)
  {
   if(n%i==0)
    s=s+i;
  }
   System.out.println(s);
 }
}