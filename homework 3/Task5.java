import java.util.*;
public class Task5{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int h,s,m;
    System.out.println("Enter number of seconds");
    s=sc.nextInt();
    h=s/3600;
    s=s%3600;
    m=s/60;
    s=s%60;
    System.out.println("Hour(s):"+ h);
    System.out.println("Minute(s):"+ m); 
    System.out.println("Second(s):"+ s);
    sc.close();
  }
}
