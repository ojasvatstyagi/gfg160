package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (n == 0) return ans;

        int count1 = 0;
        int count2 = 0;
        int major1 = 0;
        int major2 = 0;

        for (int ele : nums) {
            if (ele == major1) {
                count1++;
            } else if (ele == major2) {
                count2++;
            } else if (count1 == 0) {
                major1 = ele;
                count1 = 1;
            } else if (count2 == 0) {
                major2 = ele;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: verify candidates
        count1 = 0;
        count2 = 0;
        for (int ele : nums) {
            if (ele == major1) count1++;
            else if (ele == major2) count2++;
        }

        if (count1 > n / 3) ans.add(major1);
        if (count2 > n / 3) ans.add(major2);

        return ans;
    }
}

