//JAVA code for printing digits

import java.util.Scanner;

public class H4T18
{
 public static void main(String[]args)
 {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a number");
  int N= input.nextInt();
  int c=1;
  while(N/10! =======0)
  {
   N=N/10;
   c++;
  }
  System.out.println("Total "+c+" digits");
 }
}