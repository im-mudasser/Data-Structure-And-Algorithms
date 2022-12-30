package com.datastructure.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	private DNode head;
	int size;

	public void insertAtHead(int val) {
		DNode node = new DNode(val);
		node.next = this.head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		this.head = node;
		size++;
	}

	public void insertAtLast(int val) {
		DNode node = new DNode(val);
		if (this.head == null) {
			node.prev = null;
			this.head = node;
			return;
		}
		DNode curr = this.head;
		while (curr.next != null) {
			curr = curr.next;
		}
		node.prev = curr;
		node.next = null;
		curr.next = node;
		size++;

	}

	public void insertAtSpecificPosition(int index, int val) {
		DNode curr = this.head;
		DNode node = new DNode(val);
		if (index == 0) {
			insertAtHead(val);
			return;
		} else if (index == size) {
			insertAtLast(val);
			return;
		} else if (index > size) {
			System.out.println("our list size is " + size + " and you have given the index that is " + index
					+ " that excedeed the list size");
			return;
		}
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		node.next = curr.next;
		curr.next.prev = node;
		curr.next = node;
		node.prev = curr;
		size++;
	}

	// delete operations
	public int deleteFromHead() {
		if (this.size == 0) {
			System.out.println("list is empty");
			return -1;
		}
		int val = this.head.data;
		if (size == 1) {
			this.head = null;
			this.size--;
			return val;
		}
		this.head = this.head.next;
		head.prev = null;
		this.size--;
		return val;
	}

	public int deleteFromTail() {
		DNode curr = head;
		if (this.size <= 1) {
			return deleteFromHead();
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		int val = curr.data;
		curr.prev.next = null;
		this.size--;
		return val;
	}

	public int deleteFromSpecificPosition(int index) {
		DNode curr = head;
		if (this.size == 0) {
			System.out.println("list is empty");
			return -1;
		} else if (index == 0) {
			return deleteFromHead();
		} else if (index == size - 1) {
			return deleteFromTail();
		} else if (index > size) {
			System.out.println("list size exceeded");
			return -1;
		}
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		int val = curr.data;
		curr.next.next.prev = curr;
		curr.next = curr.next.next;
		size--;
		return val;
	}

	public void display() {
		DNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("NULL");
	}

	public int size() {
		return this.size;
	}

}
