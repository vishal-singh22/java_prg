package function.recursion;
import java.util.*;
public class substring {
    static ArrayList<String>findsubseq(String str){
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char singlechar=str.charAt(i);
            if(list.size()==0){
                list.add("");
                list.add("" + singlechar);
                continue;
            }
            int listsize=list.size();
            for(int j=0;j<listsize;j++){
                String temp= list.get(j)+singlechar;
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }

        }
        return list;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string you want to give result: ");
    String p=sc.nextLine();
    findsubseq(p);
   
}
}
