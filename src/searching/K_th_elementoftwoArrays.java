package searching;

public class K_th_elementoftwoArrays {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while (i < n && j < m && k > 1) {
            if (a[i] < b[j]) i++;
            else j++;
            k--;
        }

        if (i == n) return b[j + k - 1];
        else if (j == m) return a[i + k - 1];
        else return (a[i] < b[j]) ? a[i] : b[j];
    }
}
