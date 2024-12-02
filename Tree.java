public class Tree {
    public static void main(String a[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(2);
        tree.insert(5);
        tree.insert(11);
        tree.inorder();

    }
}