package com.ds.queue.custom;

public class PersonQueue {

	private int rear;
	private int front;
	private int size;
	private Person[] queue;
	private int total;

	public PersonQueue() {
		rear = 0;
		front = 0;
		size = 50;
		queue = new Person[50];
	}

	public PersonQueue(int size) {
		rear = 0;
		front = 0;
		this.size = size;
		queue = new Person[this.size];
	}

	public boolean enqueue(Person item) {
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

	public Person dequeue() {
		Person item = queue[front];
		// front++;
		front = (front + 1) % size;
		total++;
		return item;
	}

	public boolean isFull() {
		return size == total;
	}

}
