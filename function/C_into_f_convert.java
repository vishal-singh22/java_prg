package function;
import java.util.*;
public class C_into_f_convert {
    static void ctof(float x){
        float c=(x-32)*(5/9);
        System.out.println(" fahrenhiet in celsius is : "+c);

    }
    static void ftoc(float x){
        float f=((9/5)*x)+32;
        System.out.println("celsius in fehrenhiet is : "+f);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the temperature in celcious and  Fahrenheit");
        float t=sc.nextFloat();
        System.out.println("converter into which Fahrenheit or celsius ?\n" + "f for  Fahrenheit\nc for celsius");
        char s=sc.next().charAt(0);
        switch(s){
            case 'f':
            case 'F':
            ftoc(t);
            break;
            case 'c':
            case 'C':
            ctof(t);
            break;
            default:
            System.out.println("you enter a wrong keyword");
            System.out.println("converter into which Fahrenheit or celsius ?\n" + "f for  Fahrenheit\n c for celsius");

        }

    }
    
}
