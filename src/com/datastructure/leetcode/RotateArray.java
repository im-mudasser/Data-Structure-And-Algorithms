package com.datastructure.leetcode;

public class RotateArray {

	private static void rev(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// 3 4 5 1 2
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 100;
		k = k % arr.length;
		rev(arr, 0, arr.length - k - 1);
		rev(arr, arr.length - k, arr.length - 1);
		rev(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
