import java.util.Scanner;
public class Task10
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("What is your favorite car?");
    String car=sc.nextLine();
    System.out.println("How many times do you want to print it?");
    int num=sc.nextInt();
    for(int carC=1;carC<=num;++carC)
      System.out.println(car);
  }
}
                       