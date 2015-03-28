package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	/*
	 * Quick Sort: http://en.wikipedia.org/wiki/Quicksort
	 */
	
	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	private static int partition(int[] a, int begin, int end) {
		int pivotIndex = (begin + end)/2;
		int pivot = a[pivotIndex];
		swap(a, pivotIndex, end);
		
		int index = begin;
		for(int i = begin; i <= end; i++) {
			if(a[i] < pivot) {
				swap(a, i, index);
				index = index + 1;
			}
		}
		
		swap(a, index, end);
		return pivotIndex;
	}
	
	private static void quicksort(int[]a , int begin, int end) {
		if(begin < end) {
			int pivot = partition(a, begin, end);
			quicksort(a, begin, pivot);
			quicksort(a, pivot+1, end);
		}
	}
	
	public static void sort(int[] a) {
		quicksort(a, 0, a.length-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] split = scan.nextLine().split(" ");
		
		int[] array = new int[split.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}

		System.out.println(Arrays.toString(array));
		QuickSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}