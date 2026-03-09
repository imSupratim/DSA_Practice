import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class Traversal{
    static void preorder(Node root){
        if(root == null){
            return; 
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node node){
        if(node == null){
            return ;
        }

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    static void postorder(Node node){
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
}


public class Main {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        root.right = new Node(3);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.print("Preorder traversal: ");
        Traversal.preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        Traversal.inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        Traversal.postorder(root);
        System.out.println();

    }
}
