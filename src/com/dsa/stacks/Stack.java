package com.dsa.stacks;

class Node {

	public int data;
	public Node next;
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	public int peek(Node head){
		return head.data;
	}
	
	public Node push(int data){
		Node head = this;
		Node newNode = new Node(data, null);
		if(head == null){
			head = newNode;
			return head;
		}
		newNode.next = head;
		return newNode;
	}
}

public class Stack {

	public static void main(String[] args){

		Node n1 = new Node(1, null);
		Node n2 = new Node(2, n1);
		Node n3 = new Node(3, n2);
		Node head = new Node(4, n3);
		
		//Empty Check
		System.out.println("Check if empty");
		boolean isEmpty = (head == null);
		System.out.println("Empty Check result" + isEmpty);
		
		//Push
		System.out.println("-----------------------------------------------");
		System.out.println("Push an element");
		Node stackAfterPush = head.push(10);
		while(stackAfterPush != null){
			System.out.println(stackAfterPush.data);
			stackAfterPush = stackAfterPush.next;
		}
		
		//Pop
		System.out.println("------------------------------------------------");
		System.out.println("Pop an element");
		if(head == null){
			System.out.println("Stack is empty"); // Code is dead as the inputs are hardcoded
		} else{
			int poppedData = head.data;
			System.out.println("Popped Data: " + poppedData);
			Node stackAfterPop = head.next;
			System.out.println("Stack after pop");
			while(stackAfterPop != null){
				System.out.println(stackAfterPop.data);
				stackAfterPop = stackAfterPop.next;
			}
		}
	}
}
