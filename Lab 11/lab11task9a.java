import java.util.*;
public class lab11task9a{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] a=new int[15];
    for(int i=0;i<a.length;i++){
      System.out.println("give a nember between 0 to 9");
      a[i]=sc.nextInt();
    }
   for(int j=0;j<=9;j++){
       int count=0;
      for(int x=0;x<a.length;x++){
        if(a[x]==j){
          count++;
        }
      }
        System.out.println(j+"has been entered"+count+"times");
      }
  }
}
    