package main.adt;

public class HashTableSeparateChaining {
	int M;
	LinkedList list[];
	
	public HashTableSeparateChaining() {
		this(97);
	}
	
	public HashTableSeparateChaining(int M) {
		this.M = M;
		list = new LinkedList[M];
		
		for(int i = 0; i < M; i++) {
			list[i] = new LinkedList();
		}		
	}
	
	private int hash(int key) {
		return (((Integer)key).hashCode() & 0x7fffffff ) % M;
	}
	
	public String get(int key) {
		return list[hash(key)].get(key);
	}
	
	public void put(int key, String value) {
		list[hash(key)].put(key,  value);
	}
	
	public static void main(String[] args) {
		HashTableSeparateChaining hashtable = new HashTableSeparateChaining();
		hashtable.put(1, "A");
		hashtable.put(2, "B");
		hashtable.put(3, "C");
		
		System.out.println(hashtable.get(2));
		System.out.println(hashtable.get(5));
	}
}