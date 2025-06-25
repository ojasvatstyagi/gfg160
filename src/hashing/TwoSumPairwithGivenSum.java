package hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoSumPairwithGivenSum {

    public boolean twoSum(int arr[], int target) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
