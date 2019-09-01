import java.util.Scanner;
public class Task7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please type a quantity");
        int n=sc.nextInt();
        System.out.println("please type a number");
        int a=sc.nextInt();
        int c;
        int max=a;
        int min=a;
        int sum=a;
        double avg;
        for(c=2;c<=n;c++){
            
            
            System.out.println("please type a number");
            int b=sc.nextInt();
            
            if(b>max){
                max=b;
            }
            else if (b<min){
                min=b;
            }
            sum=sum+b;
        }
        
        avg=sum/n;
        System.out.println("Max="+max);
        System.out.println("Min="+min);
        System.out.println("Average="+avg);
    }
}