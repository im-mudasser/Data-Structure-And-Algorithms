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
//	public static void rm(SNode head) {
//		SNode curr = head;
//		if (curr == null) {
//			return;
//		}
//		while (curr.next != null) {
//			if (curr.data == curr.next.data) {
//				curr.next = curr.next.next;
//
//			} else {
//				curr = curr.next;
//			}
//
//		}
//
//	}

	// sol 3
	public static void rm(SNode head) {
		SNode p1 = head;
		SNode p2 = p1.next;
		if (head == null) {
			return;
		}
		while (p2.next != null) {
			if (p1.data != p2.data) {
				p1.next = p2;
				p1 = p2;
			}
			p2 = p2.next;
		}

		p1.next = null;

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
