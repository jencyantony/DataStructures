package com.dsa.linkedlists;

class LinkedListNode {

	public int data;
	public LinkedListNode next;
	
	public LinkedListNode(int data, LinkedListNode next){
		this.data = data;
		this.next = next;
	}
	
	public LinkedListNode append(int data){
		LinkedListNode head = this;
		if(head == null){
			head = new LinkedListNode(data, null);
			return head;
		}
		LinkedListNode current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new LinkedListNode(data, null);
		return head;
	}
	
	public LinkedListNode prepend(int data){
		LinkedListNode head = this;
		if(head == null){
			head = new LinkedListNode(data, null);
			return head;
		}
		LinkedListNode current = new LinkedListNode(data, head);
		head = current;
		return head;
	}
	
	public LinkedListNode deleteNodeWithValue(int data){
		LinkedListNode head = this;
		if(head == null) return null;
		if(head.data == data){
			head = head.next;
			return head;
		}
		LinkedListNode current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return null;
	}
	
	public LinkedListNode reverseList(){
		LinkedListNode current = this;
		LinkedListNode previous = null;
		LinkedListNode next = null;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
		
	}
}

public class LinkedList {

	public static void main(String[] args){
		LinkedListNode n5 = new LinkedListNode(25, null);
		LinkedListNode n4 = new LinkedListNode(20, n5);
		LinkedListNode n3 = new LinkedListNode(15, n4);
		LinkedListNode n2 = new LinkedListNode(10, n3);
		LinkedListNode head = new LinkedListNode(5, n2);
		
		System.out.println("------------------------------------");
		//Append
		System.out.println("Append data to linkedlist:");
		LinkedListNode listAfterAppend = head.append(30);
		while(listAfterAppend != null){
			System.out.println(listAfterAppend.data);
			listAfterAppend = listAfterAppend.next;
		}
		System.out.println("------------------------------------");
		//Prepend
		System.out.println("Prepend data to linkedlist:");
		LinkedListNode listAfterPrepend = head.prepend(1);
		while(listAfterPrepend != null){
			System.out.println(listAfterPrepend.data);
			listAfterPrepend = listAfterPrepend.next;
		}
		System.out.println("------------------------------------");
		//Delete
		System.out.println("Delete data from linkedlist:");
		LinkedListNode listAfterDeletion = head.deleteNodeWithValue(5);
		while(listAfterDeletion != null){
			System.out.println(listAfterDeletion.data);
			listAfterDeletion = listAfterDeletion.next;
		}
		System.out.println("------------------------------------");
		//Reverse
		System.out.println("Reverse linkedlist:");
		LinkedListNode reversedList = head.reverseList();
		while(reversedList != null){
			System.out.println(reversedList.data);
			reversedList = reversedList.next;
		}
		
	}
}