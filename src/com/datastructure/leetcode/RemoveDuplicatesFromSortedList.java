package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class RemoveDuplicatesFromSortedList {
	// sol#1
//	public void rem(SNode head) {
//		SNode currAddress = head;
//		SNode curr = head;
//		if (curr == null) {
//			return;
//
//		}
//		while (curr.next != null) {
//			if (curr.data != curr.next.data) {
//				currAddress.data = curr.data;
//				currAddress = currAddress.next;
//			}
//			curr = curr.next;
//		}
//		currAddress.data = curr.data;
//		currAddress.next = null;
//	}
	// sol#2
	public static void rm(SNode head) {
		SNode curr = head;
		if (curr == null) {
			return;
		}
		while (curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;

			} else {
				curr = curr.next;
			}

		}

	}

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(2);
		LL.insertAtLast(2);
		LL.insertAtLast(5);
		LL.insertAtLast(111);
		LL.insertAtLast(133);
		LL.insertAtLast(167);
		LL.insertAtLast(167);
		rm(LL.head);
		LL.display();

	}

}
