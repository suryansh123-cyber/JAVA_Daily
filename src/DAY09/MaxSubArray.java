public class MaxSubArray {
    public static void main(String[] args) {
        int n = 9;
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0; st<n ; st++){
            int cursum = 0;
            for(int end = st; end<n ; end++){
                cursum += arr[end];
                maxSum = Math.max(cursum, maxSum);
                System.out.println("Current Subarray: " + st + " to " + end + ", Sum: " + cursum);
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
    }
}
