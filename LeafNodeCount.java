package DSA_26;

public class LeafNodeCount {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int countLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(123);
        root.left = new Node(23);
        root.right = new Node(312);
        root.left.left = new Node(-3);
        root.left.right = new Node(5);

        System.out.println("leaf nodes count is:"+countLeafNodes(root));  // 3
    }
}
