package function;
import java.util.Scanner;
public class paramater_area {
    static float parameter_rectangle(float a, float b){
        float l=a;
        float w=b;
        return (2*(l+w));

    }
    
    static float area_rectangle(float a, float b){
        float l=a;
        float w=b;
        return (l*w);
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and breadth of the rectangle : ");
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float res1=parameter_rectangle(l,w);
        float res2=area_rectangle(l,w);
        System.out.println("area is " +res2 + " parameter is " +res1);


    }

}
