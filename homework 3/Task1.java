import java.util.*;
public class Task1{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Marks");
    int num=sc.nextInt();
    if(num>=50) System.out.println("Pass");
    else System.out.println("You shall not pass");
    sc.close();
  }
}
