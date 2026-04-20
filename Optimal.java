import java.util.Arrays;

public class Optimal {
    public long findOptimalServers(int[] responseTime, int[] bootTime){
        int n = responseTime.length;
        long [] val = new long[n];
        
        for(int i = 0 ; i <n ; i++){
            val[i] = responseTime[i] - bootTime[i];
        }
        Arrays.sort(val);

        int left =0 ;
        int right = n-1;
        int count = 0;
        while (left<right) {
            if (val[left]+val[right]>0) {
                count += (right - left);
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
