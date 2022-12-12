package com.datastructure.array;

public class BinarySearch {
	public static int binarySearch(int[] arr, int searchItem) {

		int pos = -1;
		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int middle = (first + last) / 2;
			if (arr[middle] == searchItem) {
				pos = middle;
				break;
			} else if (arr[middle] > searchItem) {
				last = middle - 1;

			} else {
				first = middle + 1;
			}
		}

		return pos;
	}

	public static void main(String[] args) {
		int arr[] = { 77, 99, 44, 55, 22, 88, 11, 00, 66, 33 };
		int searchItem = 55;
		int searchResult = BinarySearch.binarySearch(arr, searchItem);
		if (searchResult == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("found at " + (searchResult + 1) + " position and its index is : " + searchResult);
		}

	}

}
