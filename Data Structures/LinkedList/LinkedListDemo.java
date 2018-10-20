package com.linkedlist;

/**
 * Singly Linked List Demo
 * 
 * @author Ashish
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.insertAtHead("A");
		ls.insertAtHead("M");
		ls.insertAtHead("C");
		ls.insertAtHead("F");
		ls.insertAtHead("H");

		System.out.println(ls);
		System.out.println(ls.length());
		ls.deleteFromHead();
		System.out.println(ls);
		System.out.println(ls.length());
		System.out.println(ls.search("C"));
		System.out.println(ls.search("N"));

		DoublyLinkedList<Integer> dls = new DoublyLinkedList<>();
		dls.insertAtHead(1);
		dls.insertAtHead(3);
		dls.insertAtHead(9);
		dls.insertAtHead(5);
		System.out.println(dls);
		System.out.println(dls.length());
	}
}
