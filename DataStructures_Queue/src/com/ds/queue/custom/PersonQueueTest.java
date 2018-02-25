package com.ds.queue.custom;

public class PersonQueueTest {
	public static void main(String[] args) {

		PersonQueue pQ = new PersonQueue();
		Person p1 = new Person(1, "KP");
		Person p2 = new Person(2, "KP1");
		Person p3 = new Person(3, "KP2");

		pQ.enqueue(p1);
		pQ.enqueue(p2);
		pQ.enqueue(p3);
		
		System.out.println(pQ.dequeue());

	}
}
