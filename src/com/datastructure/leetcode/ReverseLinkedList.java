package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class ReverseLinkedList {

	public static SNode reverse(SNode head) {
		SNode prev = null;
		SNode curr = head;
		SNode front = head;
		while (curr != null) {
			front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;

		}
		head = prev;
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(3);
		LL.insertAtLast(4);
		LL.insertAtLast(5);
		SNode curr = reverse(LL.head);

		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}
