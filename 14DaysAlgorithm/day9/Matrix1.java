class Solution {
    public int[][] updateMatrix(int[][] A) {
        int[][] dir = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    q.offer(new int[] { i, j });
                }
            }
        }

        int level = 0;
        while (q.size() > 0) {
            level++;
            for (int i = q.size(); i > 0; i--) {
                int[] xy = q.poll();
                for (int[] d : dir) {
                    int nx = xy[0] + d[0];
                    int ny = xy[1] + d[1];
                    if (nx >= 0 && nx < A.length && ny >= 0 && ny < A[0].length && A[nx][ny] == 1) {
                        A[nx][ny] = -level;
                        q.offer(new int[] { nx, ny });
                    }
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] *= -1;
            }
        }

        return A;
    }

    public int nearestZero(int mat[][], int i, int j) {
        int row = mat.length;
        int col = mat[0].length;
        if (i < 0 || j < 0 || i >= row || j >= col || mat[i][j] == 0) {
            return 0;
        }
        int count = 1;
        mat[i][j] = 0;
        int top = 1;
        int bottom = 1;
        int left = 1;
        int right = 1;
        top += nearestZero(mat, i + 1, j);
        bottom += nearestZero(mat, i - 1, j);
        left += nearestZero(mat, i, j + 1);
        right += nearestZero(mat, i, j - 1);
        System.out.println("top " + top);
        System.out.println("bottom " + bottom);
        System.out.println("left " + left);
        System.out.println("right " + right);
        int v = Math.min(top, bottom);
        int h = Math.min(left, right);
        count = Math.min(v, h);

        return count;
    }
}

// https://leetcode.com/problems/01-matrix/