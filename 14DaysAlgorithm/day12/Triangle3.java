class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle.size() == 0) {
            return 0;
        }

        // re-use each row of input, if input can be modified
        for (int i = 1; i < triangle.size(); i++) { // @ note: starts at index=1

            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = triangle.get(i);

            for (int j = 0; j < currentRow.size(); j++) {
                int upLeft = j - 1 >= 0 ? prevRow.get(j - 1) : Integer.MAX_VALUE;
                int upRight = j < prevRow.size() ? prevRow.get(j) : Integer.MAX_VALUE;

                currentRow.set(j, currentRow.get(j) + Math.min(upLeft, upRight));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int each : triangle.get(triangle.size() - 1)) {
            min = Math.min(min, each);
        }

        return min;
    }
}

// link:https:// leetcode.com/problems/triangle/