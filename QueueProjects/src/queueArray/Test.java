package queueArray;

public class Test {
	public static void main(String[] args) {
		Queue q = new Queue(2);
		
		q.addQueue(10);
		q.addQueue(20);
		q.addQueue(30);
		q.addQueue(40);
		
		System.out.println("---------------------------");
		System.out.println(q.removeQueue() + " remove from queue");
		System.out.println("---------------------------");
		System.out.println("Front item is " + q.getFront());
		System.out.println("Back item is " + q.getBack());
	}
}
