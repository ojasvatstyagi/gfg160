package hashing;

import java.util.HashMap;;

public class Countpairswithgivensum {

    public int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) count += map.get(complement);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
