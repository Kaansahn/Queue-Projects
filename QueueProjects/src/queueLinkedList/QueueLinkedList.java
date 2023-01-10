package queueLinkedList;

public class QueueLinkedList {
	private Node front;
	private Node rear;
	private int size;
	
	public QueueLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	void enqueue(int data) {
		Node oldRear = rear;
		rear = new Node();
		rear.setData(data);
		rear.setNext(null);
		if (isEmpty()) 
			front = rear;
		else 
			oldRear.setNext(rear);
		size++;
		System.out.println(data + " added to the queue.");
	}
	
	int dequeue() {
		int data = front.getData();
		front = front.getNext();
		if (isEmpty()) 
			return -1;
		else
			size--;
		System.out.println(data + " removed from the queue.");
		return data;
	}

}
