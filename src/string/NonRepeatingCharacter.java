package string;

public class NonRepeatingCharacter {

    public char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;
        for (char ch : s.toCharArray()) if (freq[ch - 'a'] == 1) return ch;
        return '$';
    }
}
