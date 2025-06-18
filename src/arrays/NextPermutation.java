package arrays;

public class NextPermutation {

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;

        while(i >= 0 && arr[i] >= arr[i+1]) i--;

        if (i < 0) {
            reverseArray(arr, 0, n-1);
            return;
        }

        int j = n-1;
        while(arr[i] >= arr[j]) j--;
        swap(arr, i, j);

        reverseArray(arr, i+1, n-10);
    }

    private void reverseArray(int[] arr, int i, int j) {
        int high = j;
        int low = i;
        while(low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
