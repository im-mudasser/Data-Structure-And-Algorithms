package com.datastructure.array.assignment1;

public class ShuffleMerge {
	public static int shuffleMerge(int[] arr1, int[] arr2) {
		int[] largeArray = new int[arr1.length + arr2.length];
		int i = 0;
		int index = 0;
		int flag = 0;
		if (largeArray.length < (arr1.length + arr2.length)) {
			flag = 0;
		} else {
			while (i < arr1.length) {
				largeArray[index] = arr1[i];
				largeArray[index + 1] = arr2[i];
				i++;
				index += 2;
			}
			flag = 1;
		}
		// display
//		for (int j = 0; j < largeArray.length; j++) {
//			System.out.print(largeArray[j] + " ");
//		}

		return flag;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 11, 16, 7, 3, 8 };
		int[] arr2 = { 9, 10, 6, 5, 4, 2 };
		int status = shuffleMerge(arr1, arr2);
		System.out.println(status);

	}

}
