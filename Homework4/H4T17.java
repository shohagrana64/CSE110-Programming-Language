//JAVA code for Fibonacci!!

public class H4T17
{
 public static void main(String[]args)
 {
  int a=0, b=1,c;
  System.out.println(a);
  System.out.println(b);
  
  for(c=a+b;c<=1600;c=a+b)
  {
   System.out.println(c);
   a=b;
   b=c;   
  }
 }
}
