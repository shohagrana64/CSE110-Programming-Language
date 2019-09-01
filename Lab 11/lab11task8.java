import java.util.*;
public class lab11task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String[] a={"zero","one","two","three","four","five","six","seven","eight","nine"};
    System.out.println("give a number between 0-9");
    int n=sc.nextInt();
    System.out.println(a[n]);
  }
}