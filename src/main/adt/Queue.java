package main.adt;

import java.util.Scanner;

public class Queue {
	private int head;
	private int tail;
	private int queue[];
	
	Queue(int size) {
		queue = new int[size];
	}
	
	private boolean isFull() {
		if(head == tail + 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isEmpty() {
		if(head == tail) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enque(int num) throws Exception {
		if(isFull()) {
			throw new Exception("Queue Overflow");
		} else {
			queue[tail] = num;
			if(tail == queue.length){
				tail = 0;
			} else {
				tail = tail + 1;
			}
		}
	}
	
	public int deque() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue Underflow");
		} else {
			int item = queue[head];
			if(head == queue.length) {
				head = 0;
			} else {
				head = head + 1;
			}
			return item;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int qSize = scan.nextInt();
		int enqItems = scan.nextInt();
		int deqItems = scan.nextInt();
		
		Queue queue = new Queue(qSize);
		for(int i = 0; i < enqItems; i++) {
			queue.enque(i);
		}

		for(int i = 0; i < deqItems; i++) {
			System.out.println(queue.deque());
		}
	}
}