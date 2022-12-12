package com.datastructure.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 9, 5, 0, 2, 7 };
		insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i + 1];
			int j = i;
			for (; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				}

			}
			arr[j + 1] = temp;
// 2 5 7 8 9
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
