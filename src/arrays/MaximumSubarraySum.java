package arrays;

public class MaximumSubarraySum {
    public int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
