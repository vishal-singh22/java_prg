package other_questions;
import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping the value of a is : " +a);
        System.out.println("before swapping the value of b is : " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the value of a is : " +a);
        System.out.println("after swapping the value of b is : " +b);
    }
    
}
