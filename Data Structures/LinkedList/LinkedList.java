
package com.linkedlist;

/**
 * Singly Linked list
 * 
 * @author Ashish
 *
 * @param <T>
 */
public class LinkedList<T> {
	private Node<T> head = null;

	/**
	 * Time complexity O(1)
	 * 
	 * @param data
	 */
	public void insertAtHead(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	/**
	 * Time complexity O(n)
	 * 
	 * @return
	 */
	public int length() {
		int length = 0;
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			currentNode = currentNode.getNextNode();
			length++;
		}
		return length;
	}

	/**
	 * Time complexity O(1)
	 */
	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	}

	/**
	 * Time complexity O(n)
	 * 
	 * @param data
	 * @return
	 */
	public Node<T> search(T data) {
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			if (currentNode.getData() == data) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			sb.append(currentNode);
			currentNode = currentNode.getNextNode();
			sb.append(",");
		}
		sb.append("}");
		return sb.toString();
	}

}
