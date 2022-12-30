package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class RotateList {

	public static SNode rotateList(SNode head, int k) {
		SNode tail = head;
		SNode prev = head;
		SNode next = null;

		// go end of the list and point to tail
		while (tail.next != null) {
			tail = tail.next;
		}
		int size = sizeOfList(head);

		k = k % size;
		int i = size - k;
		if (k > 0) {
			while (i > 1) {
				prev = prev.next;
				i--;
			}
			next = prev.next;
			prev.next = null;
			tail.next = head;
			head = next;
		}
		return head;
	}

	private static int sizeOfList(SNode curr) {
		int size = 0;
		while (curr != null) {
			size++;
			curr = curr.next;
		}
		return size;
	}

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(3);
		LL.insertAtLast(4);
		LL.insertAtLast(5);
		SNode head = rotateList(LL.head, 6);
		SNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
