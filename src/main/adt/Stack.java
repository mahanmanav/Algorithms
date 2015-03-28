package main.adt;

import java.util.Scanner;

public class Stack {
	private int top = 0;
	private int stack[];
	
	Stack(int size) {
		stack = new int[size];
	}
	
	private boolean isEmpty() {
		if(top == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isFull() {
		if(top == stack.length) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Stack Overflow");
		} else {
			stack[top] = element;
			top = top + 1;
		}
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack Underflow");
		} else {
			top = top - 1;
			int item = stack[top];
			return item;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int stackSize = scan.nextInt();
		int pushItems = scan.nextInt();
		int pullItems = scan.nextInt();
		
		Stack stack = new Stack(stackSize);
		for(int i = 0; i < pushItems; i++) {
			stack.push(i);
		}

		for(int i = 0; i < pullItems; i++) {
			System.out.println(stack.pop());
		}
	}
}