import java.util.*;
public class Task7{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1st side");
    int x=sc.nextInt();
    System.out.println("Enter 2nd side");
    int y=sc.nextInt();
    System.out.println("Enter 3rd side");
    int z=sc.nextInt();
    double s= (x+y+z)/2 ;
    double area= Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println(s);
    System.out.println(area);
    sc.close();
  }
}
