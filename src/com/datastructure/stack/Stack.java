package com.datastructure.stack;

public class Stack {

	protected int[] data;
	protected int top = -1;

	public static final int DEFAULT_SIZE = 10;

	public Stack() {
		this(DEFAULT_SIZE);
	}

	public Stack(int size) {
		this.data = new int[size];
	}

	protected int size() {
		return data.length;
	}

	protected void push(int value) throws Exception {
		if (isFull()) {
			throw new Exception("stack is full");
		}
		data[++top] = value;

	}

	protected int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		}
		return data[top--];

	}

	protected int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty");
		}
		return data[top];

	}

	protected boolean isFull() {
		return top == size() - 1;
	}

	protected boolean isEmpty() {
		return top == -1;
	}

}
