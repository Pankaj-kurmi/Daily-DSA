import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
      System.out.println(removeDuplicate("bananas"));
    }
    public static String removeDuplicate(String s){
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if (!set.contains(ch)) {
                set.add(ch);
                res.append(ch);
            }
        }
        return res.toString();
        
    }
}
