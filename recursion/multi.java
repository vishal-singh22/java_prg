package recursion;

public class multi {
    public static int multiple(int x){
        if(x!=1) return x*multiple(x-1);
        else return x;
    }
    public static void main(String[] args) {
        int mul=multiple(5);
        System.out.println("multiple of natural number is "+mul); 
    }
    
}