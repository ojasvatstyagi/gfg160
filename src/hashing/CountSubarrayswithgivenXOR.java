package hashing;

import java.util.HashMap;

public class CountSubarrayswithgivenXOR {

    public long subarrayXor(int arr[], int k) {
        long count = 0;
        int xor = 0, n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            if (xor == k) count++;
            if (map.containsKey(xor ^ k)) count += map.get(xor ^ k);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
