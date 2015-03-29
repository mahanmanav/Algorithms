package main.adt;

public class LinkedList {
	private Node head;
	
	private class Node {
		Integer key;
		String value;
		Node next;
		
		public Node(Integer key, String value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	};
	
	public String get(Integer key) {
		for(Node node = head; node != null; node=node.next) {
			if(node.key.equals(key)) {
				return node.value;
			}
		}
		return null;
	}
	
	public void put(Integer key, String value) {
		for(Node node = head; node != null; node = node.next){
			if(node.key == key) {
				node.value = value;
			}
		}
		
		head = new Node(key, value, head);
	}
	
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.put(1, "A");
		linkedlist.put(2, "B");
		linkedlist.put(3, "C");
		
		System.out.println(linkedlist.get(3)); //succeed
		System.out.println(linkedlist.get(5)); //fail
	}
}