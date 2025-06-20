package searching;

public class AllocateMinimumPages {

    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;
        int sum = 0, max = 0;
        for (int pages: arr) {
            sum += pages;
            max = (max < pages) ? pages : max;
        }

        int low = max, high = sum, ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, n, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int k, int maxPages) {
        int std = 1;
        int pagesSum = 0;

        for (int i = 0; i < n; i++) {
            if (pagesSum + arr[i] > maxPages) {
                std++;
                pagesSum = arr[i];
                if (std > k) return false;
            }
            else pagesSum += arr[i];
        }
        return true;
    }
}
