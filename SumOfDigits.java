class SumOfDigit{
    public static void main(String[] args) {
        int num = 6524; // 17
        System.out.println(findsum(num));
    }
    public static int findsum(int num){
        int sum = 0;

        while (num>0) {
            int temp = num %10;
            sum += temp;
            num = num /10;
        }
        return sum;
    }
}