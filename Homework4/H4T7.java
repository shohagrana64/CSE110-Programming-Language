//JAVA code for adding numbers that are multiples of both 7 and 9

public class H4T7
{
  public static void main(String[]args)
  {
    int S=0;
    
    for(int n=1;n<=600;n++)
    {
     if(n%7==0)
       if(n%9==0)
       S= S+n;
    }
    System.out.println(S);
  }
}
