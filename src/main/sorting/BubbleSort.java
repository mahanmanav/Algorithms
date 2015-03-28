package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	/*
	 * Bubble Sort: http://en.wikipedia.org/wiki/Bubble_sort
	 * 
	 * Recommendation:
	 * 1. Cocktail Sort: Bi-directional Bubble Sort
	 */
	
	public static void sort(int a[]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < (a.length - i); j++) {
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] split = scan.nextLine().split(" ");
		
		int[] array = new int[split.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}

		System.out.println(Arrays.toString(array));
		BubbleSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}