package DSA_26;

public class InsertNode {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void insert(Node root, int value) {
        if (root.left == null) {
            root.left = new Node(value);
        } else if (root.right == null) {
            root.right = new Node(value);
        } else {
            insert(root.left, value);
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        insert(root, 2);
       

        inorder(root);  
    }
}
