package com.dsa.linkedlists;

public class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
    
    public void append(int data){
        Node head = this;
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    
    public void prepend(int data){
        Node head = this;
        if(head == null){
            head = new Node(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    
    public void deleteNode(int data){
        Node head = this;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
