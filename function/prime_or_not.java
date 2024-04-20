package function;

import java.util.*;

public class prime_or_not {
    
    static String primenum(int n ){
        if(n==1) return "not a prime number" ;
    
        for (int i =2 ; i<n/2 ; i++)
            if (n %i ==0)
            return "Not a prime number" ;

    return "Prime number" ; 
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value you know the prime number or not: ");
        int p=sc.nextInt();
        primenum(p);

    }
}
