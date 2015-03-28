package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

	/*
	 * Heap Sort: http://en.wikipedia.org/wiki/Heap_Sort
	 */
	
	private static int heapSize;
	
	private static int left(int i) {
		return 2 * i;
	}
	
	private static int right(int i) {
		return (2 * i) + 1;
	}
	
	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	private static void maxHeapify(int[] a, int i) {
		int left = left(i);
		int right = right(i);
		
		int heapMax = i;
		if(left <= heapSize && a[left] > a[i]) {
			heapMax = left;
		} else {
			heapMax = i;
		}
		
		if(right <= heapSize && a[right] > a[heapMax]) {
			heapMax = right;
		}
		
		if(heapMax != i) {
			swap(a, i, heapMax);
			maxHeapify(a, heapMax);
		}
	}
	
	private static void buildMaxHeap(int[] a) {
		heapSize = a.length - 1;
		for(int i = a.length/2; i >= 0; i--) {
			maxHeapify(a, i);
		}
	}
	
	public static void sort(int[] a) {
		buildMaxHeap(a);
		for(int i = a.length; i > 0; i--) {
			swap(a, 0, i-1);
			heapSize = heapSize - 1;
			maxHeapify(a, 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] split = scan.nextLine().split(" ");
		
		int[] array = new int[split.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}

		System.out.println(Arrays.toString(array));
		HeapSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}