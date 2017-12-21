package com.dsa.binarytree;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    public boolean search(int value){
    	Node root = this;
    	
    	if(root.value == value){
    		return true;
    	}else if(root.value > value){
    		if(left == null){
    			return false;
    		} else{
    			return left.search(value);
    		}
    	} else {
    		if (right == null){
    			return false;
    		} else{
    			return right.search(value);
    		}
    	}
    }
    
    public void insert(int data){
    	Node root = this;
    	
    	if(root.value >= data){
    		if(root.left == null){
    			root.left = new Node(data, null, null);
    		} else{
    			root.left.insert(data);
    		}
    	} else {
    		if(root.right == null){
    			root.right = new Node(data, null, null);
    		} else{
    			root.right.insert(data);
    		}
    	}
    }
    
    public void printTreeInorder(){
    	Node root = this;
    	if(root.left != null){
    		root.left.printTreeInorder();
    	}
    	System.out.println(root.value);
    	if(root.right != null){
    		root.right.printTreeInorder();
    	}
    }
    
    public void printTreePreorder(){
    	Node root = this;
    	System.out.println(root.value);
    	if(root.left != null){
    		root.left.printTreePreorder();
    	}
    	if(root.right != null){
    		root.right.printTreePreorder();
    	}
    }
    
    public void printTreePostorder(){
    	Node root = this;
    	if(root.left != null){
    		root.left.printTreePostorder();
    	}
    	if(root.right != null){
    		root.right.printTreePostorder();
    	}
    	System.out.println(root.value);
    }
}

public class BinarySearchTree {
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node root = new Node(2, n1, n3);
        System.out.println("----------------------------Search---------------------------------------");
        System.out.println(root.search(3));
        
        
        System.out.println("----------------------------Insert---------------------------------------");
        root.insert(5);
        
        System.out.println("----------------------------Print Inorder---------------------------------------");
        root.printTreeInorder();
        
        System.out.println("----------------------------Print Preorder---------------------------------------");
        root.printTreePreorder();
        
        System.out.println("----------------------------Print Postorder---------------------------------------");
        root.printTreePostorder();
    }
}