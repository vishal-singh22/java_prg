package recursion;

public class sum {
    public static int sum(int x){
        if(x!=0){
        return x+sum(x-1);
        }
        else{
            return x;
        }
        
    }
    public static void main(String[] args) {
        int add=sum(5);
        System.out.println("sum is "+add);
    }
    
}
