package matrix;

public class SearchinasortedMatrix {
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = n*m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int i = mid / m;
            int j = mid % m;

            if (mat[i][j] == x) return true;
            else if (mat[i][j] < x) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
