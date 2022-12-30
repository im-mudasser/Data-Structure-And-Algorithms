package com.datastructure.linkedlist.singlylinkedlist;

public class SinglyLinkedList {
	public SNode head;
	protected SNode tail;
	protected int size;

	// inserting operations
	public void insertAtHead(int val) {
		SNode node = new SNode(val);
		node.next = head;
		this.head = node;
		if (tail == null) {
			this.tail = head;
		}
		this.size++;
	}

	public void insertAtLast(int val) {
		SNode node = new SNode(val);
		if (this.tail == null) {
			insertAtHead(val);
			return;
		}
		tail.next = node;
		tail = node;
		size++;

	}

	public void insertAtSpecificPosition(int index, int val) {
		SNode curr = this.head;
		if (size < index) {
			System.out.println("this position " + index + " is greater our " + "list size is " + this.size);
			return;

		} else if (index == 0) {
			insertAtHead(val);
			return;
		} else if (index == size) {
			insertAtLast(val);
			return;
		}
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		SNode node = new SNode(val);
		node.next = curr.next;
		curr.next = node;
		size++;
	}

	// recusive insert

	public void rec(int index, int val) {
		SNode curr = head;
		recInsert(index, val, curr);

	}

	public SNode recInsert(int index, int val, SNode curr) {
		if (index == 0) {
			SNode newNode = new SNode(val);
			newNode.next = curr;
			size++;
			return newNode;
		}

		curr.next = recInsert(index - 1, val, curr.next); // return node
		return curr;
	}

	// Deleting operations
	public int deleteFromHead() {
		if (this.size() == 0) {
			System.out.println("list is empty");
			return -1;
		}
		int val = head.data;
		this.head = head.next;
		if (this.head == null) {
			tail = null;
		}
		size--;
		return val;

	}

	public int deleteFromLast() {
		if (this.size() <= 1) {
			return deleteFromHead();
		}
		SNode curr = getNode(size - 2);
		curr.next = null;
		tail = curr;
		size--;
		return curr.data;
	}

	public int deleteAtSpecificPosition(int index) {
		if (index == 0) {
			return deleteFromHead();
		} else if (index == this.size()) {
			return deleteFromLast();
		} else if (size < index) {
			System.out.println("not found");
			return -1;
		}
		SNode curr = getNode(index - 1);
		int val = curr.next.data;
		curr.next = curr.next.next;
		size--;
		return val;
	}

	// return node at specific index
	public SNode getNode(int index) {
		SNode curr = this.head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr;
	}

	// return that node whose value is equal
	public SNode find(int val) {
		SNode curr = head;
		while (curr != null) {
			if (curr.data == val) {
				return curr;
			}
			curr = curr.next;
		}
		return null;
	}

	public int size() {
		return this.size;
	}

	public void display() {
		SNode curr = this.head;
		while (curr != null) {
			System.out.print(curr.data + " ->");
			curr = curr.next;
		}
		System.out.println("NULL");
	}
}