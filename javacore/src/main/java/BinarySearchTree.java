package main.java;

public class BinarySearchTree {
	
	TreeNode root;
	void insert(int value) {
		root = insertRec(root, value);
	}
	TreeNode insertRec(TreeNode node, int value) {
		if(node == null) {
			node = new TreeNode(value);
			return node;
		}
		if(value < node.value) {
			node.left = insertRec(node.left, value);
		} else if( value > node.value) {
			node.right = insertRec(node.right, value);
		}
		return node;
	}
	void inOrder() {
		inOrderRec(root);
	}
	void inOrderRec(TreeNode node) {
		if(node != null) {
			inOrderRec(node.left);
			System.out.println(node.value);
			inOrderRec(node.right);
		}
	}

	public static void main(String[] args) {
		 BinarySearchTree bst = new BinarySearchTree();
	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(70);
	        bst.insert(60);
	        bst.insert(80);

	        System.out.println("In-order traversal of the BST:");
	        bst.inOrder();
	}

}
class TreeNode{
	int value;
	TreeNode left, right;
	TreeNode(int item) {
		value = item;
		left = right = null;
	}
}

