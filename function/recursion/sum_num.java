package function.recursion;
import java.util.*;
public class sum_num {
    static void recr_sum(int n,int sum){
        if(n==0){
            System.out.println("sum is : "+sum);
            return;
        }
        sum =n%10;
        n=n/10;
        recr_sum(n/10,sum);
        
    }
    public static void main(String[] args){
        int sum=0;
        recr_sum(5246,sum);
    }

}
