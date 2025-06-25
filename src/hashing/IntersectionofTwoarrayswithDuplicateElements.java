package hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoarrayswithDuplicateElements {

    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if(i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) i++;
            else j++;
        }
        return ans;
    }
}
