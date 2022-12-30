package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class MergeTwoSortedList {

	public static SNode merge(SNode l1, SNode l2) {

		SNode dummy = new SNode(0);
		SNode curr = dummy;

		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				curr.next = l1;
				l1 = l1.next;
			} else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if (l1 != null) {
			curr.next = l1;
		} else {
			curr.next = l2;
		}
		return dummy.next;
	}

	public static void display(SNode ans) {
		while (ans != null) {
			System.out.print(ans.data + "->");
			ans = ans.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		SinglyLinkedList l1 = new SinglyLinkedList();
		SinglyLinkedList l2 = new SinglyLinkedList();
		l1.insertAtLast(5);
		l1.insertAtLast(1);
		l1.insertAtLast(2);
		l1.insertAtLast(2);
		l2.insertAtLast(1);
		l2.insertAtLast(111);
		SNode ans = merge(l1.head, l2.head);
		display(ans);
	}

}
