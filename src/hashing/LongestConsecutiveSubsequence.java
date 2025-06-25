package hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        Arrays.sort(arr);
        int max = 1;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) continue;
            else if (arr[i] == arr[i - 1] + 1) ans++;
            else ans = 1;
            max = Math.max(max, ans);
        }

        return max;
    }
}

