package com.linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> IntegerLinkedList = new SimpleLinkedList<>();
        Node<Integer> nodeOne = new Node<>(70);
        IntegerLinkedList.add(nodeOne);
        Node<Integer> nodeTwo = new Node<>(30);
        IntegerLinkedList.add(nodeTwo);
        Node<Integer> nodeThree = new Node<>(56);
        IntegerLinkedList.add(nodeThree);
    }
}
