package sorting;

import java.util.ArrayList;

public class InsertInterval {

    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0, n = intervals.length;
        int start = newInterval[0];
        int end = newInterval[1];

        while (i < n && intervals[i][1] < start) ans.add(intervals[i++]);
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        ans.add(new int[]{start, end});
        while (i < n) ans.add(intervals[i++]);

        return ans;
    }
}
