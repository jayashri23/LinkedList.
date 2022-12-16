package com.linkedlist;

public class LinkedList {
    class Node {   // Create a node
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int d){
        Node newNode=new Node(d);


        if (head == null) {
            head = newNode;
        } else {

            tail.next = newNode;
            newNode.next=null;

        }
        tail = newNode;

    }
    public void insertBetweenNode(int a){
        Node newNode=new Node( a);
        Node current=head;
        while(current!=null) {
            if (current.data != 56) {
                current = current.next;
            } else if (current.data == 56)
                break;
        }
        Node temp=current.next;
        newNode.next=temp;
        current.next=newNode;
    }

    public void deleteElement(){
        if(this.head!=null) {
            Node temp=this.head;
            this.head=this.head.next;
            temp= null;
        }


    }
public Node popLast() {
    if (head == null || head.next != null) {
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }return head;
}
    public void display() {                 // Print the linked list
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        System.out.println("Linked list: ");
        li.addNode(56);
        li.addNode(70);
        li.display();
        System.out.println("\nAdded new element:");
        li.insertBetweenNode(30);
        li.display();
     //   System.out.println("\n\nAfter deleting first element:");
      //  li.deleteElement();
       // li.display();
        System.out.println(" \nAfter Deleting Last element:");
        li.popLast();
        li.display();

    }
}