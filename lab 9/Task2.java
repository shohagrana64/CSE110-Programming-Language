public class Task2{
    public static void main(String[] args){
        int sum = 0;
        for (int c = 1;c<=600;++c){
            if(c%7==0 && c%9==0){
                sum=sum+c;
                
            }
        }
         System.out.println(sum);
    }
}
               
    