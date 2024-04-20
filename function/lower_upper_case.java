package function;
import java.util.*;
public class lower_upper_case {
    static void l_to_U(String a){
        int n=a.length();
        StringBuffer str = new StringBuffer(n);
        for(int i=0;i<n;i++){
            char c=a.charAt(i);
            if(Character.isUpperCase(c)){
               c= Character.toLowerCase(c);
            }
            else{
               c= Character.toUpperCase(c);

            }
            str.append(c);
        }
        System.out.println("enter stirng is : " +a);
        System.out.println("Converting case: "+str.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string ");
        String l=sc.nextLine();
        l_to_U(l);

    }
    
}
