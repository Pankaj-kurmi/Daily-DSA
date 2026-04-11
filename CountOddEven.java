import java.util.*;
class CountOddEve {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        CountOddEven(li);
    }
    public static void CountOddEven(List<Integer> li ){
        int odd = 0; // 1,3,5
        int even = 0; // 2,4,6

        for(int n: li){
            if(n % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The count of Odd number is : " + odd);
        System.out.println("The count of Even number is :" + even);
    }
}