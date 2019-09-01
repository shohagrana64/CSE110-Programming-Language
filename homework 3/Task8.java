import java.util.*;
public class Task8{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number of published articles");
    int num=sc.nextInt();
    int fee= num*500;
    System.out.println(fee+ "tk is the fee");
    sc.close();
  }
}
