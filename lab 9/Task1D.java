public class Task1D {
    public static void main(String[] args){
        
        for(int c=18; c<=63; c+=9){
            if(c%2==0){
                System.out.println(c);
            }
            else {
                System.out.println(c*(-1));
            }
        }
    }
}