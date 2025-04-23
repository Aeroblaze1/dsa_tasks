package DSA_26;

class CountNodes {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(3);
        root.left.left = new Node(67);
        root.left.right = new Node(5);
        System.out.println("Number of nodes : " + countNodes(root));
    }
}
