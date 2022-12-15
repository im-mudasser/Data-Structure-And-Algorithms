package com.datastructure.linkedlist.doublylinkedlist;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtHead(100);
		dll.insertAtHead(123);
		dll.insertAtHead(234);
		dll.display();
		dll.insertAtLast(145);
		dll.display();
		dll.insertAtSpecificPosition(3, 300);
		dll.display();
		dll.deleteFromSpecificPosition(2);

	}

}
