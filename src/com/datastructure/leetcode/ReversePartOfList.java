package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class ReversePartOfList {
	public static SNode rev(SNode head, int left, int right) {
		SNode prev = null;
		SNode curr = head;
		if (head == null) {
			return head;
		}
		while (left > 1) {
			prev = curr;
			curr = curr.next;
			left--;
			right--;

		}
		SNode con = prev;
		SNode tail = curr;
		SNode front = null;

		// reverse
		while (right > 0) {
			front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
			right--;

		}
		if (con != null) {
			con.next = prev;
		} else {
			head = prev;
		}
		tail.next = curr;
		return head;

	}

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(3);
		LL.insertAtLast(4);
		LL.insertAtLast(5);
		LL.display();
		SNode head = rev(LL.head, 1, 2);
		SNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}
