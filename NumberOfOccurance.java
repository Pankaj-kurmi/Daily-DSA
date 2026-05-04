import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurance {
    public static void main(String[] args) {
        String s ="apple";
        countNumberofOccurance(s);
    }
    public static void countNumberofOccurance(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
