import java.util.*;
public class TaskRana{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Marks");
    int num=sc.nextInt();
    if(num>=80 && num<=100) System.out.println("A+");
    if(num>=75 && num<=79) System.out.println("A");
    if(num>=70 && num<=74) System.out.println("A-");
    if(num>=40 && num<=69) System.out.println("Pass");
    if(num<0 || num>100) System.out.println("Wrong Input");
    if(num<40) System.out.println("Fail");
    sc.close();
  }
}