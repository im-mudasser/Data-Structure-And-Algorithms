package com.datastructure.array.assignment1;

public class Reversing {

	public static int reverseArray(int[] arr, int start, int last) {
		int flag = 0;
		if (start < 0 || last >= arr.length) {
			flag = 0;
		} else {
			while (start < last) {
				int temp = arr[start];
				int j = arr[last];
				arr[start] = j;
				arr[last] = temp;
				last--;
				start++;

			}
			flag = 1;
		}
		return flag;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int val = Reversing.reverseArray(arr, 0, 11);
		System.out.println(val);

	}

}
