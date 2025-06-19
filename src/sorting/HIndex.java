package sorting;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n;
        Arrays.sort(citations);
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (citations[n - mid] >= mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
