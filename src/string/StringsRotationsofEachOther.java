package string;

public class StringsRotationsofEachOther {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String s1s1 = s1+s1;
//        return s1s1.contains(s2);   // will give TLE
        int j=0;
        for(int i=0;i<s1s1.length(); i++){
            if(j< s2.length() && s1s1.charAt(i) == s2.charAt(j) ){
                j++;
            }
        }
        if(j == s2.length()){
            return true;
        }
        return false;
    }
}
