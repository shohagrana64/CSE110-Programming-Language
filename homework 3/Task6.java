import java.util.*;
public class Task6{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value");
    int S=sc.nextInt();
    int L;
    if(S>=100){
      L=12000/(4+((S*S)/14900));
      System.out.println(L);
    }
    if(S<100){
      L=3000-125*S*S;
      System.out.println(L);
    }
    sc.close();
  }
}