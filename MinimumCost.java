import java.util.Arrays;

class Solution{
     public long[] getMinimumCost(int[] cost, long maxSpend){
        int n = cost.length;
        int left= 1;
        int right = n;

        long maxNodules=0;
        long minCost =0;

        while (left<=right) {
            int mid = (left+right
            )/2;

            long totalCost = calculate(cost , mid);
            
            if (totalCost<=maxSpend) {
                maxNodules = mid;
                minCost = totalCost;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return new long[]{maxNodules,minCost};
     }
     private long calculate(int[]cost , int k){
        int n = cost.length;
        long arr[] = new long[n];

        for(int i = 0 ; i<n ;i++){
            arr[i] = cost[i]+(long)(i+1)*k;
        }
        Arrays.sort(arr);
        long sum =0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        return sum;
     }
     public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] cost = {2, 3, 5};
        long maxSpend = 11;
        
        long[] result = sol.getMinimumCost(cost, maxSpend);
        
        System.out.println("Max Modules = " + result[0]);
        System.out.println("Min Cost = " + result[1]);
    }
}