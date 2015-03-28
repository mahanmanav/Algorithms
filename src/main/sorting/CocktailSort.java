package main.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CocktailSort {
	
	/*
	 * Cocktail Sort: http://en.wikipedia.org/wiki/Cocktail_sort
	 * 
	 */
	
	public static void sort(int[] a) {
		int begin = 0;
		int end = a.length;
		boolean swapped = true;
		
		while(swapped) {
			swapped = false;
			
			begin = begin + 1;
			for (int j = begin; j < end; j++) {
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}

			end = end - 1;
			swapped = false;
			
			for (int j = end - 1; j >= begin - 1; j--) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] list = scan.nextLine().split(" ");
		
		int[] array = new int[list.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(list[i]);
		}
		
		System.out.println(Arrays.toString(array));
		CocktailSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}