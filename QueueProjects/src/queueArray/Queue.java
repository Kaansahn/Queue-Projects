package queueArray;

public class Queue {
	private int front;
	private int back;
	private int size;
	private int capacity;
	private int[] array;
	
	public Queue(int capacity) {
		front = 0;
		back = capacity-1;
		this.capacity = capacity;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue q) {
		return q.size == q.capacity;
	}
	
	boolean isEmpty(Queue q) {
		return q.size == 0;
	}
	
	void addQueue(int item) {
		if (isFull(this)) 
			return;
		this.back = (this.back + 1) % this.capacity;
		this.array[this.back] = item;
		this.size = this.size+1;
		System.out.println(item + " added to queue. ");
	}
	
	int removeQueue() {
		if (isEmpty(this)) 
			return -1;
		int item = this.array[this.front];
		this.front = (this.front + 1) & this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	int getFront() {
		if (isEmpty(this)) 
			return -1;
		return this.array[this.front];
	}
	
	int getBack() {
		if (isEmpty(this)) 
			return -1;
		return this.array[this.back];
	}

}
