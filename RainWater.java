class RainWater{
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        int ans = findWater(arr);
        System.out.println("The total water trapped = " + ans);
    }
    public static int findWater(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int leftmax=0;
        int rightmax = 0;
        int totalwater = 0;

        while (left<=right) {
            if (arr[left]<arr[right]) {
                if (arr[left]>= leftmax) {
                    leftmax = arr[left];
                }
                else{
                    totalwater += leftmax - arr[left];
                }
                left++;
            }
            else{
                if (arr[right]>= rightmax) {
                    rightmax = arr[right];
                }
                else{
                    totalwater += rightmax - arr[right];
                }
                right--;
            }
        }
        return totalwater;
    }
}