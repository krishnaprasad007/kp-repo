package com.ds.stack.primitive;

public class IntStackTest {
	public static void main(String[] args) {
		IntStack stack = new IntStack();
		for (int i = 5; i > 0; i--) {
			stack.push(i);
		}
		System.out.println(stack.pop());
	}
}
