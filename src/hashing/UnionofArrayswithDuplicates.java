package hashing;

import java.util.Arrays;

public class UnionofArrayswithDuplicates {

    public static int findUnion(int a[], int b[]) {
        int n1 = a.length, n2 = b.length;
        int unique = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] == b[j]) {
                unique++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                unique++;
                i++;
            } else {
                unique++;
                j++;
            }
        }
        while (i < n1) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            unique++;
            i++;
        }
        while (j < n2) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            unique++;
            j++;
        }
        return unique;
    }
}
