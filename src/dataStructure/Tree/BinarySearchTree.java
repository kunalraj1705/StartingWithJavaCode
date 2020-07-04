package dataStructure.Tree;

/**
 * * @author Kunal Raj Bhardwaj
 */


public class BinarySearchTree {
    class Node{
        int data;
        Node leftChild, rightChild;

        public Node(int data){
            this.data = data;
        }
    }

    //Root Node
    Node root = null;

    //Calls the recursive method to insert the data
    public void insert(int data){
        root = recInsert( root, data);
    }

    //Recursive method to insert the node
    Node recInsert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.leftChild = recInsert(root.leftChild, data);
        }else if(data > root.data){
            root.rightChild = recInsert(root.rightChild, data);
        }

        return root;
    }

    void inorder(){
        recInorder(root);
    }

    void recInorder(Node root){
        if(root != null){
            recInorder(root.leftChild);
            System.out.println(root.data);
            recInorder(root.rightChild);
        }
    }

    public static void main(String arg[]){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        binarySearchTree.inorder();
    }
}
