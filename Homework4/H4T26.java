//JAVA code for prime numbers

import java.util.Scanner;

public class H4T26
{
 public static void main(String[]args)
 {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a number");
  int n= input.nextInt();
  int c=0;
  for(int i=1;i<=n;i++)
  {
   if(n%i==0)
    c++;
  }
  if(c==2)
   System.out.println("Prime");
  else
   System.out.println("Not Prime");
 }
}