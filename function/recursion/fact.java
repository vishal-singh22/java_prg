class fact{
    public static void main(String[] args) {
        int a=fact(5);
        System.out.println(a);
    }
    static int fact(int n){
        if(n==0) return 1;
        else{
        return n*fact(n-1);
        }
    }
}