//JAVA code for adding numbers that are multiples of either 7 or 9 but not both

public class H4T9
{
  public static void main(String[]args)
  {
    int S=0,n=1;
    
    while(n<=600)
    {
     if(n%7==0)
     {
      if(n%9==0)
       n++;
      else
        S= S+n;
     }
     else if(n%9==0)
       S= S+n;
       
     n++;
    }
    System.out.println(S);
  }
}
