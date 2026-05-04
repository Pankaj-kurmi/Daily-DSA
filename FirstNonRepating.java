import java.util.HashMap;

public class FirstNonRepating {
    public static void main(String[] args) {
        String s = "Software Services";
        System.out.println(findFirstNonRepating(s));
    }
    public static char findFirstNonRepating(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char n: s.toCharArray()){
            map.put(n,map.getOrDefault(n,0 ) +1);
        }
        for(char ch : s.toCharArray()){
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '0';

    }
}
