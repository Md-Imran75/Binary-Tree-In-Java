public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRecursion(root, data);
    }

    public Node insertRecursion(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data < root.data) {
            root.left = insertRecursion(root.left, data);
        } else {
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderRecursion(root);
    }

    public void inorderRecursion(Node root) {
        if (root != null) {

            inorderRecursion(root.left);
            inorderRecursion(root.right);
            System.out.println(root.data);

        }
    }
}