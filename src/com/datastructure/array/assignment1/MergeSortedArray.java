package com.datastructure.array.assignment1;

//leetcode question O(1)
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 0 };
		int[] arr2 = { 1 };
		int m = 0;
		int n = 1;
		mergeTwoSortedArrays(arr1, m, arr2, n);
	}

	public static void mergeTwoSortedArrays(int[] arr1, int m, int[] arr2, int n) {
		int i = m + n - 1;
		while (m > 0 && n > 0) {
			if (arr2[n - 1] > arr1[m - 1]) {
				arr1[i] = arr2[n - 1];
				n--;
				i--;
			} else {
				arr1[i] = arr1[m - 1];
				m--;
				i--;
			}
		}
		// display
		while (n > 0) {
			arr1[m] = arr2[n - 1];
			n--;
		}
		for (int disp = 0; disp < arr1.length; disp++) {
			System.out.print(arr1[disp] + " ");
		}
	}

}
