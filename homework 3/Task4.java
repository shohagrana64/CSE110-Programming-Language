import java.util.*;
public class Task4{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Payment");
    int p=sc.nextInt();
    System.out.println("Enter age");
    int a=sc.nextInt();
    int cal;
    if(a<=0 || a>=120) System.out.println("Your not born yet or ur dead");
    else if(a<18 || p<10000) System.out.println("No Tax");
     
    else if(p>=10000 && p<=20000){
      cal=(p*5)/100;
      System.out.println(cal+" 5% Tax");
    }
    else if(p>20000){
      cal=(p*10)/100;
      System.out.println(cal+ " 10% Tax");
    }
    sc.close();
  }
}