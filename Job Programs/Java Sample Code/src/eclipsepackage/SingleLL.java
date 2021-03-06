package eclipsepackage;

import java.util.*;

public class SingleLL {
     static Node current;
     static Node temp;
     static Node root;
     public class Node {
    	 
    	     int noOfLinkedList =0;
    	 
    	        int data;
    	        Node nextNode;
    	 
    	        Node(int d) {
    	            data = d;
    	            noOfLinkedList++;
    	        }
    	}
 
      public void addNode(int data) {
         Node node = new Node(data);
         if (root == null)
         {
        	 root=node;
        	 node.nextNode = null;
         }
         else
         {
        	 current =root;
        	 while(current.nextNode!=null)
        	 {
        		 current = current.nextNode;
        		 
        	 }
        	 current.nextNode = node;
        	 node.nextNode = null;
         }
      }
      
public void insertNode(int data, int after){
	Node node = new Node(data);
	int ithNode =1;
	current =root;
	while (after != ithNode){
		current = current.nextNode;
		ithNode++;
	}
	temp = current.nextNode;
	current.nextNode = node;
	node.nextNode=temp;
}
  
public void deleteNode(int nodeToDelete){
	int ithNode =1;
	current =root;
	if(nodeToDelete==1){
		root= root.nextNode;
		
	}else
	{
		while(ithNode != nodeToDelete-1){
			current =current.nextNode;
			ithNode++;
		}
		current.nextNode = current.nextNode.nextNode;
	}
	
}

public void print()
{
	current=root;
	boolean arrow =false;
	while(current!=null)
	{
		System.out.print((arrow) ? "-->|"+ current.data +"|" :"|" + current.data);
		arrow =true;
		current = current.nextNode;
	}
}
public static void main(String[] args){
	SingleLL list = new SingleLL();
	list.addNode(3);
	list.addNode(5);
	list.addNode(7);
	list.addNode(8);
	
	list.print();
	
}

}


