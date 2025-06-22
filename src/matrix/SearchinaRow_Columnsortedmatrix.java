package matrix;

public class SearchinaRow_Columnsortedmatrix {

    public static boolean matSearch(int mat[][], int X) {
        int n = mat.length;
        int m = mat[0].length;
        int right = m - 1;
        int top = 0;

        while (right >= 0 && top <= n - 1) {
            if (mat[top][right] == X) return true;
            else if (mat[top][right] > X) right--;
            else top++;
        }
        return false;
    }
}
