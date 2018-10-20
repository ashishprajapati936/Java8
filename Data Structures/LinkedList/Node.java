package com.linkedlist;

/**
 * Single Linked Node
 * 
 * @author Ashish
 *
 * @param <T>
 */
public class Node<T> {
	private T data;
	private Node<T> nextNode;

	Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "" + this.data.toString();
	}

}
