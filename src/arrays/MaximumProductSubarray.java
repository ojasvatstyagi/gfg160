package arrays;

public class MaximumProductSubarray {

   public int maxProduct(int[] arr) {
       int n = arr.length;
       int maxProduct = Integer.MIN_VALUE;
        int left = 1;
        int right = 1;
       for (int i = 0; i < n; i++) {
           if (left == 0) left = 1;
           if (right == 0) right = 1;
           left *= arr[i];
           right *= arr[n-1-i];
           maxProduct = Math.max(maxProduct, Math.max(left, right));
       }
       return maxProduct;
   }
}
