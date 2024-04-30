package recursion;
import java.util.*;
public class arraysum {
    static int arr_sum(int arr[],int N){
    { 
        if (N <= 0) 
            return 0; 
        return (arr_sum(arr, N - 1) + arr[N - 1]); 
    }
    }
    public static void main(String[] args) {
        int a[]={1,2,5,3,6};
        System.out.println(arr_sum(a,a.length));
    }
}
