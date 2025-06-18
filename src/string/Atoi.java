package string;

public class Atoi {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        int sign = 1;
        long res = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');
            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (res * sign);
    }
}
