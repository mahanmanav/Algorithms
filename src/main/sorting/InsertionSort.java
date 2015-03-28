package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	/*
	 * Insertion Sort: http://en.wikipedia.org/wiki/Insertion_sort
	 */
	
	public static void sort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int j = i;
			int current = a[i];
			while(j > 0 && a[j-1] > current) {
				a[j] = a[j-1];
				j = j - 1;
			}
			a[j] = current;
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
		InsertionSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}