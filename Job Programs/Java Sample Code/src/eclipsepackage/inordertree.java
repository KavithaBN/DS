package eclipsepackage;

import java.util.*;

import eclipsepackage.minelementbinarytree.Node;



public class inordertree
{
	
		class Node{
			int key;
			Node left,right;
			public Node (int d)
			{
				key =d;
				left = right =null;
			}
		}
	
	Node root;
	
	Node insert(Node root,int key)
	{
		if(root==null)
		{
			root = new Node(key);
		return root;
		}
	
	if(key <root.key)
	{
		root.left =insert(root.left,key);
	}
		else if(key>root.key)
		{
			root.right =insert(root.right,key);
		}
	return root;
}
	
	void inorderrec (Node root)
	{
		if(root!=null)
		{
			inorderrec(root.left);
			System.out.println(root.key);
			inorderrec(root.right);
		}
	}
	void postrrec (Node root)
	{
		if(root!=null)
		{
			inorderrec(root.left);
			
			inorderrec(root.right);
			System.out.println(root.key);
		}
	}
	void prerrec (Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			inorderrec(root.left);
			
			inorderrec(root.right);
		}
	}
	public static void main(String[] args)
	{
		inordertree tree = new inordertree();
		Node root = null;
	     root = tree.insert(root, 4);
		tree.insert(root,50);
		tree.insert(root,90);
		tree.insert(root,10);
		tree.insert(root,80);
		tree.insert(root,20);
		tree.insert(root,100);
		System.out.println("Inorder is");
		tree.inorderrec(root);
		System.out.println("Postorder is");
		tree.postrrec(root);
		System.out.println("Preorder is");
		tree.prerrec(root);
		
	}
}