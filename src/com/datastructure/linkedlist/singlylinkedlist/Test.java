package com.datastructure.linkedlist.singlylinkedlist;

public class Test {

	public static void main(String[] args) {
		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertAtHead(10);
		LL.insertAtHead(12);
		LL.insertAtHead(100);
		LL.insertAtHead(123);
		LL.display();
		LL.insertAtLast(190);
		LL.insertAtLast(300);
		LL.display();
		LL.insertAtSpecificPosition(0, 234);
		LL.display();
		LL.insertAtSpecificPosition(7, 543);
		LL.display();
		LL.insertAtSpecificPosition(4, 908);
		LL.display();
		LL.insertAtSpecificPosition(12344, 908);
		LL.display();
		LL.deleteFromHead();
		LL.display();
		LL.deleteFromHead();
		LL.display();
		LL.deleteFromLast();
		LL.display();
		System.out.println(LL.deleteAtSpecificPosition(2));
		LL.display();
		LL.deleteAtSpecificPosition(0);
		LL.display();
		LL.deleteAtSpecificPosition(4);
		LL.display();

	}

}
