package com.dsa.queues;


class Node {

	public int data;
	public Node next;
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	public boolean isEmpty(){
		return this == null;
	}
	
	public int peek(){
		return this.data;
	}
	
	//Add the data to the tail/last
	public Node enQueue(int data){
		Node head = this;
		Node newNode = new Node(data, null);
		if(head == null){
			head = newNode;
			return head;
		} 
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
}

public class Queue {

	public static void main(String[] args) {

		Node tail = new Node(20, null);
		Node n3 = new Node(15, tail);
		Node n2 = new Node(10, n3);
		Node head = new Node(5, n2);
		
		//Isempty
		System.out.println("------------------------------------");
		System.out.println("IsEmpty");
		boolean isEmpty = head.isEmpty();
		System.out.println("isEmpty result: " + isEmpty);
				
		
		//Peek
		System.out.println("------------------------------------");
		System.out.println("Peek");
		if(head != null){
			int peekResult = head.peek();
			System.out.println("Peek result: " + peekResult);
		}
				
		//Enqueue
		System.out.println("------------------------------------");
		System.out.println("Enqueue");
		Node addResult = head.enQueue(25);
		while(addResult != null){
			System.out.println(addResult.data);
			addResult = addResult.next;
		}
		
		//Dequeue
		System.out.println("------------------------------------");
		System.out.println("Dequeue");
		int itemRemoved = head.data;
		head = head.next;
		if(head == null) tail = null;
		System.out.println("Item Removed: " + itemRemoved);
		
		System.out.println("Queue after Dequeue");
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
}