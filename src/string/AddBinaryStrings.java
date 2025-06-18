package string;

public class AddBinaryStrings {
    public String addBinary(String s1, String s2) {
        int n = s1.length()-1;
        int m = s2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (n >= 0 || m >= 0) {
            int sum = carry;
            if (n >= 0) sum += s1.charAt(n--) - '0';
            if (m >= 0) sum += s2.charAt(m--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
