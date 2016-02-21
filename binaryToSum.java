package BST;

public class binaryTosum {

	
public static int Sum(Node root){

		if (root==null){
			return 0;
		}
		int old_val=root.data;	
			root.data=Sum(root.left)+Sum(root.right);
			return root.data+old_val;
		
	
		
	}	

public static void Inorder(Node root){
	
	if (root==null){
		return;
	}
	Inorder(root.left);
	System.out.print(root.data+" ");
	Inorder(root.right);
	
}
public static void main(String args[]){
	Node root=new Node(10);
	root.left=new Node(-2);
	root.right=new Node(6);
	root.left.left=new Node(8);
	root.left.right=new Node(-4);
	root.right.left=new Node(7);
	root.right.right=new Node(5);
	
	Inorder(root);
	System.out.println();
	Inorder(root);
	
	
	
}
}

