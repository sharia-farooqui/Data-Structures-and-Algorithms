import java.util.ArrayList;

public class Subseq{
    public static void main(String[] args) { 
        System.out.println(subsets("abc", ""));
    }
    public static ArrayList<String> subsets(String str, String res){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(res);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsets(str.substring(1), res+ch);
        ArrayList<String> right = subsets(str.substring(1), res);
        left.addAll(right);
        return left;
    }
}