package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class PrintAnagramsTogether {
/*
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        int n = arr.length;
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < ans.size(); j++) {
                if (isAnagram(arr[i], ans.get(j).get(0))) {
                    ans.get(j).add(arr[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ArrayList<String> list = new ArrayList<>();
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }

    private boolean isAnagram(String a, String b) {
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) freq[c - 'a']--;
        for (int i = 0; i < 26; i++) if (freq[i] != 0) return false;
        return true;
    }

 */

    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
