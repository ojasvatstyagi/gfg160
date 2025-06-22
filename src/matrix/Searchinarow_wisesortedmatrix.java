package matrix;

public class Searchinarow_wisesortedmatrix {
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mat[i][mid] == x) return true;
                else if (mat[i][mid] < x) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }
}
