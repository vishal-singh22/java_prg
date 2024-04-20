package function;
import java.util.*;
public class print_prime {
    static void prime(){
        int i=2;
        while(i<100){
            for(int j=2;j<i/2;j++){
                if (i%j==0){
                    
                }
                else{
                    System.out.println(j);
                }
                i++;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("prime number 1 to 100 is : ");
        prime();
    }
  
}
