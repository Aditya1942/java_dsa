class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return list;
        }

        list.add(new ArrayList<Integer>()); // add empty single list, to make below loop going

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tmpList = new ArrayList<>();

            int insertNum = nums[i];

            // get each permutations. eg, [1,2], [2,1]
            for (List<Integer> singlePerm : list) {

                // eg. [1,2] and insert 3, there are 3 insert position
                int singleListSize = singlePerm.size();
                for (int index = 0; index <= singleListSize; index++) { // @note: the usage of arraylist add() api:
                                                                        // add(atIndex, value)
                    singlePerm.add(index, insertNum);
                    tmpList.add(new ArrayList<Integer>(singlePerm));

                    // @note: don't forget roll back
                    singlePerm.remove(index);
                }
            }

            // update list. @note: possible issue, this is not deep copy
            list = tmpList;
        }

        return list;
    }

}

// lint : https://leetcode.com/problems/permutations/