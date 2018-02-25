package com.ds.queue.primitive;

public class IntQueueTest {

	public static void main(String[] args) {
		
		IntQueue queue = new IntQueue(10);
		queue.enqueue(0);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(0);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);

		System.out.println(queue.dequeue());
	}

}
