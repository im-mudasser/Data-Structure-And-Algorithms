package com.datastructure.sorting;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int temp = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j; // min index

				}
			}
			if (arr[i] > arr[min]) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 1, 8, 2, 7, 3, 6, 4, 9 };
		selectionSort(arr);

	}

}
