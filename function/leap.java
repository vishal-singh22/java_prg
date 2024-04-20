package function;
import java.util.*;
public class leap {
    static void enter_year(int x){
        int a=x;
        // if(a%4==0||a%100==0||a%400==0){
        //     System.out.println("year in leap ");
        // }
        // else{
        //     System.out.println("year is not leap");
        // }
        System.out.println((a%4==0 || a%100==0 || a%400==0)? "year in leap" : "year is not in leap");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year yu want");
        int x=sc.nextInt();
        enter_year(x);
    }
    
}
