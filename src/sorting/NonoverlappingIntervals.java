package sorting;

import java.util.Arrays;

public class NonoverlappingIntervals {

    public static int minRemoval(int intervals[][]) {
        int n = intervals.length;
        int ans = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < end) ans++;
            else end = intervals[i][1];
        }
        return ans;
    }
}
