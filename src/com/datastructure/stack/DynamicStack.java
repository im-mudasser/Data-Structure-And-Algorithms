package com.datastructure.stack;

public class DynamicStack extends Stack {

	public DynamicStack(int size) {

		super(size);
	}

	public DynamicStack() {
		super();
	}

	@Override

	protected void push(int value) throws Exception {
		if (isFull()) {
			int[] temp = new int[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;

		}
		super.push(value);

	}

}
