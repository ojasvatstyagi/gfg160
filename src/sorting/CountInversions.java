package sorting;

public class CountInversions {

    private int mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            int leftInversions = mergeSort(arr, left, mid);
            int rightInversions = mergeSort(arr, mid + 1, right);
            int mergedInversions = merge(arr, left, mid, right);
            return leftInversions + rightInversions + mergedInversions;
        }
        return 0;
    }

    private int merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left, inversions = 0;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++]; // inversion
                inversions += n1 - i;
            }
        }
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
        return inversions;
    }

    public int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}
