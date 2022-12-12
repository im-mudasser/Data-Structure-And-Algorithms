package com.datastructure.array;

public class LinearSearch {
	public static int linearSearch(int[] arr, int searchItem) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchItem) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 100, 122, 124, 125 };
		int searchItem = 125;
		int searchResult = BinarySearch.binarySearch(arr, searchItem);
		if (searchResult == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("found at " + (searchResult + 1) + " position and its index is : " + searchResult);
		}

	}

}
