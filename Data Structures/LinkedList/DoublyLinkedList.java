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

	public DoubleLinkedNode<T> getHead() {
		return head;
	}

	public void setHead(DoubleLinkedNode<T> head) {
		this.head = head;
	}

	public DoubleLinkedNode<T> getTail() {
		return tail;
	}

	public void setTail(DoubleLinkedNode<T> tail) {
		this.tail = tail;
	}

	/**
	 * TIme complexity O(n)
	 * 
	 * @param data
	 */
	public void insertAtHead(T data) {
		DoubleLinkedNode<T> newNode = new DoubleLinkedNode<T>(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	/**
	 * time Complexity O(n) time
	 * 
	 * @param node
	 */
	public void remove(T data) {
		DoubleLinkedNode<T> node = search(data);
		DoubleLinkedNode<T> previousNode = node.getPreviousNode();
		DoubleLinkedNode<T> nextNode = node.getNextNode();
		if (previousNode == null) {
			this.head = this.head.getNextNode();
		}

		if (nextNode == null) {
			node.getPreviousNode().setNextNode(null);
		}

		if (previousNode != null && nextNode != null) {
			previousNode.setNextNode(nextNode);
			nextNode.setPreviousNode(previousNode);
		}
	}

	/**
	 * Time complexity O(n)
	 * 
	 * @param data
	 * @param precedingData
	 */
	public void insert(DoubleLinkedNode<T> dataNode, DoubleLinkedNode<T> precedingDataNode) {
		remove(dataNode.getData());
		DoubleLinkedNode<T> newNode = new DoubleLinkedNode<T>(dataNode.getData());
		if (precedingDataNode == null) {
			insertAtHead(dataNode.getData());
		} else {
			DoubleLinkedNode<T> precedingNode = search(precedingDataNode.getData());
			newNode.setNextNode(precedingNode.getNextNode());
			precedingNode.getNextNode().setPreviousNode(newNode);

			precedingNode.setNextNode(newNode);
			newNode.setPreviousNode(precedingNode);
		}
	}

	/**
	 * Time complexity O(n)
	 * 
	 * @param data
	 * @return
	 */
	public DoubleLinkedNode<T> search(T data) {
		DoubleLinkedNode<T> currentNode = this.head;
		while (currentNode != null) {
			if (currentNode.getData() == data) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		return null;
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
