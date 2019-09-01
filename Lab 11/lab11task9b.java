import java.util.*;
public class lab11task9b{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] a=new int[15];
    int zerocount=0,onecount=0,twocount=0,threecount=0,fourcount=0,fivecount=0,sixcount=6,sevencount=0,eightcount=0,
      ninecount=0;
    for(int i=0;i<a.length;i++){
      System.out.println("give a nember between 0 to 9");
      a[i]=sc.nextInt();
      if(a[i]==0){
        zerocount++;
      }
      else{
        if(a[i]==1){
          onecount++;
        }
        else{
          if(a[i]==2){
            twocount++;
          }
          else{
            if(a[i]==3){
            threecount++;
          }
            else{
              if(a[i]==4){
                fourcount++;
              }
              else{
                if(a[i]==5){
                  fivecount++;
                }
                else{
                  if(a[i]==6){
                    sixcount++;
                  }
                  else{
                    if(a[i]==7){
                      sevencount++;
                    }
                    else{
                      if(a[i]==8){
                        eightcount++;
                      }
                      else{
                        if(a[i]==9){
                          ninecount++;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
      System.out.println("0"+zerocount+"times");
      
      System.out.println("1"+onecount+"times");
      
      System.out.println("2"+twocount+"times");
      
      System.out.println("3"+threecount+"times");
        
      
      System.out.println("4"+fourcount+"times");
      
      System.out.println("5"+fivecount+"times");
      
      System.out.println("6"+sixcount+"times");
      
      System.out.println("7"+sevencount+"times");
      
      System.out.println("8"+eightcount+"times");
      
      System.out.println("9"+ninecount+"times");
  }
}
      
      
      
      
      
      
      
      
      
      
            
      
    
   