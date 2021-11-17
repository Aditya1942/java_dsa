class Solution {
    void dfs(int[][] image, int sr, int sc, int newColor, int row, int col, int source) {
        if (sr < 0 || sr >= row || sc < 0 || sc >= col) {
            return;
        }
        if (image[sr][sc] != source) {
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, newColor, row, col, source);// top
        dfs(image, sr + 1, sc, newColor, row, col, source);// bottom
        dfs(image, sr, sc - 1, newColor, row, col, source);// left
        dfs(image, sr, sc + 1, newColor, row, col, source);// right

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        int row = image.length;
        int col = image[0].length;
        int source = image[sr][sc];

        dfs(image, sr, sc, newColor, row, col, source);

        return image;

    }
}

// link : https://leetcode.com/problems/flood-fill/