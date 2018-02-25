package com.ds.stack.primitive;

public class IntStack {

	private int top;
	private int[] stack;
	private int size;

	public IntStack() {
		top = -1;
		stack = new int[50];
		size = 50;
	}

	public IntStack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		return stack[top--];
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
