package com.datastructure.array.assignment1;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		// ProductOfArrayExceptSelf.prod(nums);
		ProductOfArrayExceptSelf.prods(nums);
	}

	/*
	 * time complexity => O(n^2) space complexity => O(n)
	 */

	private static void prods(int[] nums) {
		int len = nums.length;
		int[] left = new int[len];
		int prodLeft = 1;
		int[] right = new int[len];
		int prodRight = 1;
		int[] outArr = new int[len];

		for (int i = 0; i < nums.length; i++) {
			prodLeft *= nums[i];
			left[i] = prodLeft;
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			prodRight *= nums[i];
			right[i] = prodRight;
		}

		outArr[0] = right[1];
		outArr[len - 1] = left[len - 2];
		for (int i = 1; i <= len - 2; i++) {
			outArr[i] = left[i - 1] * right[i + 1];
		}
		for (int i = 0; i < outArr.length; i++) {
			System.out.print(outArr[i] + " ");
		}
	}

	/*
	 * brute force approach time complexity => O(n^2) space complexity => O(n)
	 */
/*	private static void prod(int[] nums) {
		int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int prod = 1;

			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					prod *= nums[j];
				}

			}
			arr[i] = prod;

		}

		// dis

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}*/
}
