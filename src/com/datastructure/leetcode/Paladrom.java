package com.datastructure.leetcode;

import com.datastructure.linkedlist.singlylinkedlist.SNode;
import com.datastructure.linkedlist.singlylinkedlist.SinglyLinkedList;

public class Paladrom {

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtLast(1);
		LL.insertAtLast(2);
		LL.insertAtLast(3);
		LL.insertAtLast(1);
		boolean res = isPalindrome(LL.head);
		System.out.println(res);
	}

	public static boolean isPalindrome(SNode head) {
		if (head == null) {
			return true;
		}
		SNode firstHalf = head;
		SNode middlePointer = mid(head);
		SNode secondHalf = rev(middlePointer);
		while (secondHalf != null) {
			if (firstHalf.data != secondHalf.data) {
				break;
			} else {
				secondHalf = secondHalf.next;
				firstHalf = firstHalf.next;
			}
		}
		if (secondHalf == null) {
			return true;
		} else {
			return false;
		}
	}

	private static SNode rev(SNode middleRef) {
		SNode prev = null;
		SNode curr = middleRef;
		SNode front = middleRef;
		while (curr != null) {
			front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;

		}
		return prev;
	}

	private static SNode mid(SNode head) {
		SNode fast = head;
		SNode slow = head;
		do {
			slow = slow.next;
			fast = fast.next.next;
		} while (fast != slow && fast != null && fast.next != null);
		return slow;
	}

}
