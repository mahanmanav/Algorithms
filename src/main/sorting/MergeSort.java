package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	
	/*
	 * Merge Sort: http://en.wikipedia.org/wiki/Merge_sort
	 */
	
	private static void merge(int[] a, int begin, int middle, int end) {
		int leftsize = middle - begin + 1;
		int rightsize = end - middle;
		
		int[] leftarray = new int[leftsize+1];
		int[] rightarray = new int[rightsize+1];
		
		for(int i = 0; i < leftsize; i++) {
			leftarray[i] = a[begin + i];
		}
		
		for(int j = 0; j < rightsize; j++) {
			rightarray[j] = a[middle+1+j];
		}
		
		leftarray[leftsize] = Integer.MAX_VALUE;
		rightarray[rightsize] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for(int k = begin; k <= end; k++) {
			if(leftarray[i] <= rightarray[j]) {
				a[k] = leftarray[i];
				i = i + 1;
			} else {
				a[k] = rightarray[j];
				j = j + 1;
			}
		}
	}
	
	private static void mergesort(int[] a, int begin, int end) {
		if(begin < end) {
			int middle = (begin + end) / 2;
			mergesort(a, begin, middle);
			mergesort(a, middle+1, end);
			merge(a, begin, middle, end);
		}
	}
	
	public static void sort(int[] a) {
		mergesort(a, 0, a.length-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] split = scan.nextLine().split(" ");
		
		int[] array = new int[split.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}
		
		System.out.println(Arrays.toString(array));
		MergeSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}