package java24.recursion;
public class natural{
    public static void print10to1(int n){
        if(n==0) return;
        System.out.println(n);
        print10to1(n-1);
    }
    public static void main(String[] args) {
        print10to1(10);
        
    }
    
}
