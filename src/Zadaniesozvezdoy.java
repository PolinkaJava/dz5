public class Zadaniesozvezdoy {
    public static void main(String[] args) {
        int n = 9;
        int m = 9;
        int[][] a = new int[n][m];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a [i][j] = num++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a [i][j] = num++;
                }
            }
        }

        for (int[] row : a) {
            for (int cell : row) {
                System.out.printf("%3d", cell);
            }
            System.out.println();
        }
    }
}


