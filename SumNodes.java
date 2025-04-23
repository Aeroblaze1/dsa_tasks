package DSA_26;

public class SumNodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("sum of nodes is : "+sumOfNodes(root)); 
    }
}
