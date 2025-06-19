package sorting;

public class MergeWithoutExtraSpace {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0 ;
            int j = gap;

            while (j < n + m) {

                if (j < n && a[i] > a[j]) swap(a, i, j);
                else if (i < n && j >= n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                }
                else if (i >= n && b[i - n] > b[j - n]) swap(b, i - n, j - n);
                i++;
                j++;
            }
            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }
}

