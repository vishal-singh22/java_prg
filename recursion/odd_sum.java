package recursion;
import java.util.*;

public class odd_sum {
    public static int sum(int N){

        if (N%2!= 0)
         return (N + sum(N - 1));
        else{
            return N;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println("enter the range ");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(sum(x));
    }
    
}
