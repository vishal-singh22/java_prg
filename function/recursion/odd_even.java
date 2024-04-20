package function.recursion;
public class odd_even {
    static void resr(int n){
        if(n==0){
            return;
        }
        resr(n-1);
        if(n%2==0){
        System.out.println(n+" even:");
        }
        else{
            System.out.println(n+" odd");
        }
        
    }
    public static void main(String[] args){
        resr(10);
    }
    
}
