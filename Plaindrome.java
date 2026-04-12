public class Plaindrome {
    public static void main(String[] args) {
        String str = "A man, a plan!";
        System.out.println(isPlaindrome(str));
    }
    public static boolean isPlaindrome(String str){
        int left =0;
        int right = str.length()-1;

        while (left< right) {
            while (left<right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left< right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
