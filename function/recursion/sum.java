public class sum {
    public static void main(String[] args) {
        int n=sum(3);
        System.out.println(n);
    }
    static int sum(int n){
        if (n!=0) return n+sum(n-1);
        else return n;

    }
}
