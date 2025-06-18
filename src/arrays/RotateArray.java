package arrays;

public class RotateArray {

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

    public void rotateArr(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }
}
