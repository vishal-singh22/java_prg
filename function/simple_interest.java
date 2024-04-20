package function;
import java.util.Scanner;
public class simple_interest {
    static float SI(int a ,int b,float c){
        int p=a;
        int t=b;
        float r=c;
        return (( p*r*t)/100);
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the rate , time period ,princple amount : ");
        int a=sc.nextInt(),b=sc.nextInt();
        float c = sc.nextFloat();

        float d=SI(a,b,c);
        System.out.println("simple interset is " + d);

    }
 
    
}

