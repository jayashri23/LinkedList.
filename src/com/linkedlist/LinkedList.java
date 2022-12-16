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
    public Node popLast(){
        if (head==null || head.next != null) {
            Node secondLast = head;
            while (secondLast.next.next != null) { ///find last element
                secondLast = secondLast.next;
            }
            secondLast.next = null;// change next of second last

        }
        return head;
    }

    public boolean searchNode( int p) {
        Node current = head;// initialize current
        while (current != null) {
            if (current.data == p) {
                System.out.println("Data found");
                return true;

            }// data found
            current = current.next;
        }

        System.out.println("Not found");
        return false;

    }

    public void inserAfterPositionWithKeyValue(int pos,int elementNew) {
        Node newNode = new Node(elementNew);
        newNode.data = elementNew;
        newNode.next = null;
        if(pos < 1) { // check positions
            System.out.print("\nInvalid.");
        } else if (pos == 1) { // Insert first node
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for(int i = 1; i < pos-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\n previous node is null.");
            }
        }
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
        // System.out.println("\n\nAfter deleting first element:");
        //li.deleteElement();
        // li.display();
        //li.popLast();
        /// System.out.println("\n\nAfter deleting last element:");
        // li.display();
        System.out.println("\n\nList after search");
        li.searchNode(30);
        li.display();
        li.inserAfterPositionWithKeyValue(3,40);
        System.out.println("\n\nAdding Element after node: ");
        li.display();
    }
}
