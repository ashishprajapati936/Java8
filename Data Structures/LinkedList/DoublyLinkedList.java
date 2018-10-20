package com.linkedlist;

/**
 * Doubly Linked List
 * 
 * @author Ashish
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {
	private DoubleLinkedNode<T> head;
	private DoubleLinkedNode<T> tail;

	public void insertAtHead(T data) {
		DoubleLinkedNode<T> newNode = new DoubleLinkedNode<T>(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	/**
	 * Time complexity O(n)
	 * 
	 * @return
	 */
	public int length() {
		int length = 0;
		DoubleLinkedNode<T> currentNode = this.head;
		while (currentNode != null) {
			currentNode = currentNode.getNextNode();
			length++;
		}
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		DoubleLinkedNode<T> currentNode = this.head;
		while (currentNode != null) {
			sb.append(currentNode);
			currentNode = currentNode.getNextNode();
			if (currentNode != null)
				sb.append(",");
		}
		sb.append("}");
		return sb.toString();
	}

}
