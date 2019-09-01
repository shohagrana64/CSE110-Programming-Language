import java.util.*;
public class Task13{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int Temp,a,b,c,d;
    System.out.println("Enter 1st number");
    a=sc.nextInt();
    System.out.println("Enter 2nd number");
    b=sc.nextInt();
    System.out.println("Enter 3rd number");
    c=sc.nextInt();
    System.out.println("Enter 4th number");
    d=sc.nextInt();
    Temp=a;
    a=b;
    b=c;
    c=d;
    d=Temp;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    sc.close();
  }
}
