class Main {
    public static void main(String[] args) {
        int arr[] = { 1,7,3,4,5,612,3,4,5};
       // int ans = findLargest(arr);
        System.out.println("The largest element is : " + findLargest(arr) );
    }
    public static int findLargest(int arr[]){
        int largest = arr[0];
       for(int i =1 ; i< arr.length ; i++){
        if(arr[i] > largest){
            largest  = arr[i];
        }
       }
        return largest;
    }
}