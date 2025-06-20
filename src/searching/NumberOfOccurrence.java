package searching;

public class NumberOfOccurrence {

    public int countFreq(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                count++;
                int left = mid - 1;
                while (left >= 0 && arr[left] == target) {
                    count++;
                    left--;
                }
                int right = mid + 1;
                while (right < arr.length && arr[right] == target) {
                    count++;
                    right++;
                }
                break;
            } else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return count;
    }
}
