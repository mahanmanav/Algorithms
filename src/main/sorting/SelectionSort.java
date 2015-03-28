package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	/*
	 * Selection Sort: http://en.wikipedia.org/wiki/Selection_sort
	 */
	
	public static void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int ajMinIndex = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[ajMinIndex]) {
					ajMinIndex = j;
				}
			}
			
			if(a[i] > a[ajMinIndex]) {
				int temp = a[i];
				a[i] = a[ajMinIndex];
				a[ajMinIndex] = temp;
			}
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
		SelectionSort.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
