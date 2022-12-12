package com.datastructure.array.assignment1;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		k = k % arr.length;
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

//		// disp
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void reverse(int arr[], int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

}
