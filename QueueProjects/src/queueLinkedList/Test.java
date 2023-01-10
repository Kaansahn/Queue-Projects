package queueLinkedList;

public class Test {
	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.dequeue();
	}
}
