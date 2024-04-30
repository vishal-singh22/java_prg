package recursion;
public class print {

    public static void print10to1(int x){
        if(x==0) return;
        System.out.print(x+"\t");
        print10to1(x-1);
       
    }

    public static void print1to10(int x){
        if(x==0) return;
        print1to10(x-1);
        System.out.print(x+"\t");
       
    }

    public static void main(String[] args) {
        System.out.println(" call function 1 to 10\n");
        print1to10(10);
        System.out.println("\n \n");
        System.out.println("\n call function 10 to 1\n");
        print10to1(10);

    }
}