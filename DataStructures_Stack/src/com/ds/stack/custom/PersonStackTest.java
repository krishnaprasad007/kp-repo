package com.ds.stack.custom;

public class PersonStackTest {

	public static void main(String[] args) {
		
		PersonStack stack = new PersonStack();
		
		Person personOne = new Person(1, "KP");
		Person personTwo = new Person(2, "PK");

		stack.push(personOne);
		stack.push(personTwo);

		System.out.println(stack.pop());
	}
}
