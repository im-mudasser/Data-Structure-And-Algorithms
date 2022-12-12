package com.datastructure.array.assignment1;

public class SortedInsert {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, -1, -1, -1 };
		int num = 3;
		int[] returnArray = sortedInsert(arr, num);

		// displaying
		for (int i = 0; i < arr.length; i++) {
			System.out.print(returnArray[i] + " ");
		}

	}

	private static int[] sortedInsert(int[] arr, int numberToInsert) {
		int i = arr.length - 4;
		for (; i >= 0 && arr[i] > numberToInsert; i--) {
			arr[i + 1] = arr[i];
		}
		arr[i + 1] = numberToInsert;
		return arr;

	}
}
