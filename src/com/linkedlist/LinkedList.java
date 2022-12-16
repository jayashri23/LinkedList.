package com.linkedlist;

public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int d){
        Node newNode = new Node(d);

        if (head == null){
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode = null;
        }
        tail =newNode;
    }
    public void insertBetweenNode(int d){
        System.out.println("Updated Linked list: ");
        Node newNode = new Node(d);
        Node current = head;
        while (current != null){
            if (current.data != 56){
                current =current.next;
            }else if(current.data == 56)
                    break;
            }
        Node temp =current.next;
        newNode.next =temp;
        current.next = newNode;
        }
        public void display(){
        Node current =head;
        if (head  == null) {
            System.out.println("list is empty");
        }
            System.out.println("Linked list node:");
        while (current != null){
            System.out.println(current.data+ "");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(56);
        linkedList.addNode(70);
        linkedList.display();
        linkedList.insertBetweenNode(30);
        linkedList.display();
    }
}
