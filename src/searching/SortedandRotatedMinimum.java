package searching;

public class SortedandRotatedMinimum {

    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        if (arr[low] <= arr[high]) return arr[low];
        while (low <= high) {
            int mid = low + ( high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) return arr[mid];
            else if (arr[mid] <= arr[high]) high = mid - 1;
            else if (arr[mid] >= arr[low]) low = mid + 1;
        }
        return -1;
    }
}
