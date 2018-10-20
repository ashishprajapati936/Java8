package com.linkedlist;

/**
 * Doubly Linked Node
 * 
 * @author Ashish
 *
 * @param <T>
 */
public class DoubleLinkedNode<T> {
	private T data;
	private DoubleLinkedNode<T> previousNode;
	private DoubleLinkedNode<T> nextNode;

	public DoubleLinkedNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoubleLinkedNode<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleLinkedNode<T> previousNode) {
		this.previousNode = previousNode;
	}

	public DoubleLinkedNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleLinkedNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
