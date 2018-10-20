package com.linkedlist;

/**
 * Insertion sort using doubly linked list
 * 
 * Unlike Array Implementation we don't have to move the unsorted array, we just
 * need to update the references
 * 
 * @author Ashish
 *
 */
public class InsertionSort {

	public static DoublyLinkedList<Integer> sort(DoublyLinkedList<Integer> linkedList) {
		try {
			DoubleLinkedNode<Integer> currentNode = linkedList.getHead();
			boolean updateReference = false;
			while (currentNode != null) {
				DoubleLinkedNode<Integer> previousNode = currentNode.getPreviousNode();
				while (previousNode != null && previousNode.getData() > currentNode.getData()) {
					previousNode = previousNode.getPreviousNode();
					updateReference = true;
				}
				if (updateReference) {
					linkedList.insert(currentNode, previousNode);
				}
				currentNode = currentNode.getNextNode();
				updateReference = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkedList;
	}
}
