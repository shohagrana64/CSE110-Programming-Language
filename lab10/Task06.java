import java.util.Scanner;
public class Task06{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int[] a=new  int[10];
        for(int c=0; c<a.length; c++){
              System.out.println("Please enter a number");
            a[c]= scanner.nextInt();
           
         
        }
        for(int c=(a.length-1); c>=0; c--){
             if(a[c]%2!=0){
                 System.out.println(a[c]);
                 break;
             }
        }
    }
}
             
         
    
