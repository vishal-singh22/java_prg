package function;
import java.util.Scanner;
public class pos_neg {
    static void type_integer(int x){
        if (x<0){
            System.out.println("-"+x+" "+"enter number is negtive integer");
        }
        else{
            System.out.println("+"+x+" "+"enter number is positive integer");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer value you want : ");
        int n=sc.nextInt();
        type_integer(n);
    }
}
