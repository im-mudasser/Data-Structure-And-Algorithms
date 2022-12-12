package com.datastructure.array.assignment1;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 5, 6 };
		mergeTwoSortedArrays(arr1, arr2);
	}

	public static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int k = 0;
		int[] sortedArray = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sortedArray[k] = arr1[i];
				i++;
				k++;
			} else {
				sortedArray[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (j < arr2.length) {
			sortedArray[k] = arr2[j];
			j++;
			k++;
		}
		while (i < arr1.length) {
			sortedArray[k] = arr1[i];
			i++;
			k++;
		}

		// display
		for (int dis = 0; dis < sortedArray.length; dis++) {
			System.out.print(sortedArray[dis] + " ");
		}
	}

}
