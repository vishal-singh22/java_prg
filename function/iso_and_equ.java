package function;
import java.util.*;
public class iso_and_equ {
    static void find_type(float x,float y,float z){ 
        if(x==y &&y!=z || x==z && z!=y||y==z && y!=x){
            System.out.println("triangle is isolases ");
        }
        else if(x==y && y==z){
            System.out.println("triangle is equlateral ");

        }
        else{
            System.out.println("triangle is scalen");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of three sides of triangle :  ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        float z=sc.nextFloat();
        find_type(x,y,z);
    }
    
}
