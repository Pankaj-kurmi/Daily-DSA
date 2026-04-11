import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "This is a String";
        System.out.println(revString(s));
        System.out.println("------------------");
        System.out.println(revString2(s));
        System.out.println("------------------");
        System.out.println(reveString3(s));
    }
    public static String revString(String s){
        String res = "";
        int n = s.length()-1;
        for(int i=n ; i>=0 ; i--){
            res = res + s.charAt(i);
        }
        return res;
    }
    // second better approach
    public static String revString2(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        StringBuilder res = new StringBuilder();
       while (!stack.isEmpty()) {
        res = res.append(stack.pop());
       }
       return res.toString();
    }
    // Best approach for in place 
    public static String reveString3(String s){
        char arr[] = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while (i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
        return new String(arr);
    }
    
}
