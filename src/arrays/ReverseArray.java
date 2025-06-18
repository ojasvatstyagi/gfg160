package arrays;

public class ReverseArray {

    public void reverseArray(int[] arr) {
        int high = arr.length, low = 0;
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
