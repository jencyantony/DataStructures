package com.dsa.doublylinkedlists;

class DoublyLinkedListNode {

	public int data;
	public DoublyLinkedListNode next;
	public DoublyLinkedListNode previous;
	
	public DoublyLinkedListNode(int data, DoublyLinkedListNode next, DoublyLinkedListNode previous){
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	public DoublyLinkedListNode append(int data){
		DoublyLinkedListNode head = this;
		if(head == null){
			head = new DoublyLinkedListNode(data, null, null);
			return head;
		}
		DoublyLinkedListNode current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new DoublyLinkedListNode(data, null, current);
		return head;
	}
	
	public DoublyLinkedListNode prepend(int data){
		DoublyLinkedListNode head = this;
		if(head == null){
			head = new DoublyLinkedListNode(data, null, null);
			return head;
		}
		DoublyLinkedListNode current = new DoublyLinkedListNode(data, null, null);
		current.next = head;
		head = current;
		return head;
	}
	
	public DoublyLinkedListNode deleteNodeWithValue(int data){
		DoublyLinkedListNode head = this;
		if(head == null) return null;
		if(head.data == data){
			head = head.next;
			return head;
		}
		DoublyLinkedListNode current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				if(current.next != null){
					current.next.previous = current;
				}
				return head;
			}
			current = current.next;
		}
		return null;
	}
	
	public DoublyLinkedListNode reverseList(){
		DoublyLinkedListNode current = this;
		DoublyLinkedListNode previous = null;
		DoublyLinkedListNode next = null;
		while(current != null){
			next = current.next;
			previous = current.previous;
			
			current.previous = next;
			current.next = previous;
			
			previous = current;
			current = next;		
		}
		
		return previous;
		
	}

}


public class DoublyLinkedList {

	public static void main(String[] args){
		DoublyLinkedListNode n5 = new DoublyLinkedListNode(25, null, null);
		DoublyLinkedListNode n4 = new DoublyLinkedListNode(20, null, null);
		DoublyLinkedListNode n3 = new DoublyLinkedListNode(15, null, null);
		DoublyLinkedListNode n2 = new DoublyLinkedListNode(10, null, null);
		DoublyLinkedListNode head = new DoublyLinkedListNode(5, null, null);
		head.previous = null;
		head.next = n2;
		n2.previous = head;
		n2.next = n3;
		n3.previous = n2;
		n3.next = n4;
		n4.previous = n3;
		n4.next = n5;
		n5.previous = n4;
		n5.next = null;
		
		System.out.println("------------------------------------");
		//Append
		System.out.println("Append data to linkedlist:");
		DoublyLinkedListNode listAfterAppend = head.append(30);
		while(listAfterAppend != null){
			System.out.println(listAfterAppend.data);
			listAfterAppend = listAfterAppend.next;
		}
		System.out.println("------------------------------------");
		//Prepend
		System.out.println("Prepend data to linkedlist:");
		DoublyLinkedListNode listAfterPrepend = head.prepend(1);
		while(listAfterPrepend != null){
			System.out.println(listAfterPrepend.data);
			listAfterPrepend = listAfterPrepend.next;
		}
		System.out.println("------------------------------------");
		//Delete
		System.out.println("Delete data from linkedlist:");
		DoublyLinkedListNode listAfterDeletion = head.deleteNodeWithValue(5);
		while(listAfterDeletion != null){
			System.out.println(listAfterDeletion.data);
			listAfterDeletion = listAfterDeletion.next;
		}
		
		System.out.println("------------------------------------");
		//Reverse
		System.out.println("Reverse linkedlist:");
		DoublyLinkedListNode reversedList = head.reverseList();
		while(reversedList != null){
			System.out.println(reversedList.data);
			reversedList = reversedList.next;
		}
	}
}
