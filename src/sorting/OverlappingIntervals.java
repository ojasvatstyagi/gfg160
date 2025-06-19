package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {

    public List<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= end) end = Math.max(end, arr[i][1]);
            else {
                ans.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        ans.add(new int[]{start, end});
        return ans;
    }
}
