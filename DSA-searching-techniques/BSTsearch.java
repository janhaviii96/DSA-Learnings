// Node class for BST
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTsearch {
    Node root;

    // Constructor
    BSTsearch() {
        root = null;
    }

    // Search a key in BST
    boolean search(Node root, int key) {
        // Base case: root is null or key is present at root
        if (root == null) return false;
        if (root.key == key) return true;

        // Key is smaller → search left subtree
        if (key < root.key) {
            return search(root.left, key);
        }
        // Key is larger → search right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {
        // Build a small BST manually
        BSTsearch tree = new BSTsearch();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        int key = 60;
        if (tree.search(tree.root, key)) {
            System.out.println("Key " + key + " found in BST");
        } else {
            System.out.println("Key " + key + " not found in BST");
        }
    }
}

/*
Complexity:
Best Case: O(1) : Key found at root
Average Case: O(log n) : Balanced BST
Worst Case: O(n) : Skewed BST (like a linked list)
Space: O(h) due to recursion stack,  h = tree height
*/
