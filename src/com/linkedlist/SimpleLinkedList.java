package com.linkedlist;

public class SimpleLinkedList <D>{

    public Node<D> headNode ;
    public Node<D> tailNOde ;
    public Node<D> currentNode;

    public void add(Node<D> nodeAdded){
        System.out.println("Node to be added :" +nodeAdded.getData());
        if (headNode == null) {
            headNode = nodeAdded;
            System.out.println("Head node with data :" + nodeAdded.getData());
        }
        tailNOde = nodeAdded;
        System.out.println("Tail Node with data :" +nodeAdded.getData());
        if (currentNode != null){
            currentNode.setNextNode(nodeAdded);
            System.out.println("Node with data " + currentNode.getData() + " is connected to node with data " + nodeAdded.getData());

        }
        currentNode =nodeAdded;
        System.out.println("Current node with data " + nodeAdded.getData());
    }

}
