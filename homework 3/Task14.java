import java.util.*;
public class Task14{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int num=sc.nextInt();
    if(num>=0) System.out.println(num);
    else System.out.println(-num);
    sc.close();
  }
}
