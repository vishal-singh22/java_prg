package function;
import java.util.*;
public class swap {
    static void SW(int a ,int b){
        int fi=a;
        int se=b;
        fi=fi+se;
        se=fi-se;
        fi=fi-se;
        System.out.println("\tAFTER SWAPPING \nthe value of first is :"+fi+"\n" +"the value of sec is :" +se);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the vlaues yu want to swap : ");
        int first=sc.nextInt(),sec=sc.nextInt();
        System.out.println("\tBEFORE SWAPPING\nthe value of first is  :" +first+"\n" + "the value of sec is :" +sec);
        SW(first,sec);

    }
    
}
