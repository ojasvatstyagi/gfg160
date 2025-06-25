package hashing;

import java.util.HashMap;

public class SubarrayswithsumK {

    public int countSubarrays(int arr[], int k) {
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int target = sum - k;
            if (map.containsKey(target)) ans += map.get(target);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
