/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        print(root, 1);
        return print(root);
    }

    public Node print(Node root) {
        if (root == null)
            return root;
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null && q.isEmpty())
                return root;
            else if (n == null) {
                q.add(null);
                continue;
            } else {
                n.next = q.peek();
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);

            }
        }
        return root;

    }
}

// link :
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/