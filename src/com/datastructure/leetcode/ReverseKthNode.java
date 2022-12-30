package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class ReverseKthNode {
	private static int sizeOfList(SNode curr) {
		int size = 0;
		while (curr != null) {
			size++;
			curr = curr.next;
		}
		return size;
	}

	private static SNode reverseKthNode(SNode head, int k) {
		int size = sizeOfList(head);
		SNode curr = head;
		SNode prev = null;
		SNode front = null;
		SNode tail = head;
		SNode dummy = new SNode(0);
		while (size != 0) {
			if (size < k) {
				break;
			}
			for (int i = 0; i < k && curr != null; i++) {
				front = curr.next;
				curr.next = prev;
				prev = curr;
				curr = front;
				size--;
			}
			dummy.next = start;

		}
		if (curr != null) {
			tail.next = curr;
		} else {
			tail.next = null;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(3);
		LL.insertAtLast(4);
		LL.insertAtLast(5);
		SNode head = reverseKthNode(LL.head, 2);
		SNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}
