package com.ds.stack.custom;

public class PersonStack {

	private int top;
	private int size;
	private Person stack[];

	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person[50];
	}

	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[50];
	}

	public boolean push(Person item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		}
		return false;
	}

	public Person pop() {
		return stack[top--];
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
