
import java.util.*;

public class Combinations1 {
    class Solution1 {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            subset(1, n, new ArrayList<>(), result, k);
            return result;
        }

        public void subset(int index, int n, List<Integer> current, List<List<Integer>> result, int k) {
            if (current.size() == k) {
                result.add(new ArrayList<>(current));
                return;
            }
            for (int i = index; i <= n; i++) {
                current.add(i);
                subset(i + 1, n, current, result, k);
                current.remove(current.size() - 1);
            }
       }
    }

    public static void main(String[] args) {
        Combinations1 obj = new Combinations1();
        Solution1 sol = obj.new Solution1();
        List<List<Integer>> result = sol.combine(4, 2);
        for (List<Integer> list : result) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
