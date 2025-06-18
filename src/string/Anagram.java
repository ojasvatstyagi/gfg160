package string;

public class Anagram {
    public boolean areAnagrams(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n != m) return false;
        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) freq[ch-'a']++;
        for (char ch : s2.toCharArray()) freq[ch-'a']--;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
}
