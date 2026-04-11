public class PrimeNumber {
    public static void main(String[] args) {
      int n = 7;
      System.out.println(checkPrime(n));
      System.out.println("");
      System.out.println(primee(479));
    }
    public static boolean checkPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i = 2 ; i<= n/2 ; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean primee(int n){
        if (n<=1) {
            return false;
        }
        for(int i =2 ; i*i <=n ; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
