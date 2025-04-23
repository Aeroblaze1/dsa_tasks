package DSA_26;

public class ValueinTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        return search(root.left, value) || search(root.right, value);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(search(root, 4));  // true
        System.out.println(search(root, 6));  // false
    }
}
