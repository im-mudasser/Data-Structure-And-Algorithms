package com.datastructure.recursion;

public class BinarySearch {

	public static int binarySearch(int arr[], int start, int end, int targetValue) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == targetValue) {
			return mid;
		} else if (arr[mid] > targetValue) {
			return binarySearch(arr, 0, mid - 1, targetValue);
		} else {
			return binarySearch(arr, mid + 1, end, targetValue);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 100, 144, 233, 567, 908, 1000 };
		int ans = binarySearch(arr, 0, arr.length - 1, 567);
		System.out.println(ans);

	}

}
