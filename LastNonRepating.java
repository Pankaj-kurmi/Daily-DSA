import java.util.HashMap;

public class LastNonRepating {
    public static void main(String[] args) {
        String s = "Software services";
        System.out.println(findLastNonRepating(s));
    }
    public static char findLastNonRepating(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if (ch != ' ') {
                map.put(ch , map.getOrDefault(ch,0)+1);
            }
        }
        for(int i =s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            if (ch!= ' ' && map.get(ch)==1) {
                return ch;
            }
        }
        return '\0';
    }
}
