package function;
import java.util.*;
public class sum_natural {
    static void recr_sum(int n,int sum){
        if(n==0){
            System.out.println("sum of the nth number will be :" + sum);
            return;
        }
        sum+=n;
        recr_sum(n-1,sum);
    }
    static int sumofnum(int n){
        if(n==0){
            return 0;
        }
        return n+sumofnum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth number you want to try the sum ");
        int num=sc.nextInt();
        int sum=0;
        recr_sum(num,sum);
        int result=sumofnum(num);
        System.out.println("the is the sum of nth number : " +result);
    }
    
}
