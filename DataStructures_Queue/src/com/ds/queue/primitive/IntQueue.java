package com.ds.queue.primitive;

public class IntQueue {

	private int rear;
	private int front;
	private int size;
	private int[] queue;
	private int total;

	public IntQueue() {
		rear = 0;
		front = 0;
		size = 50;
		queue = new int[50];
	}

	public IntQueue(int size) {
		rear = 0;
		front = 0;
		this.size = size;
		queue = new int[this.size];
	}

	public boolean enqueue(int item) {
		if (isFull()) {
			return false;
		} else {
			queue[rear] = item;
			// rear++;
			rear = (rear + 1) % size;
			total--;
			return true;
		}
	}

	public int dequeue() {
		int item = queue[front];
		// front++;
		front = (front + 1) % size;
		total++;
		return item;
	}

	public boolean isFull() {
		return size == total;
	}

}
