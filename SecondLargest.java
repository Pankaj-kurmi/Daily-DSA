public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,8,9,3,4,5};
        findsecondLargest(arr);
    }
    public static void findsecondLargest(int arr[]){
        int  largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if (num > largest) {
              secondLargest = largest;
              largest = num;  
            }
            else if(num > secondLargest && num !=largest){
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        }
        else{
            System.out.println("Second Largest element is =" + secondLargest);
        }
    }
}
