package com.datastructure.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// note in this case array is sorted
		int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 100, 100 };
		int j = removeDuplicates(nums);
		for (int i = 0; i < j; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int removeDuplicates(int[] nums) {

		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j] = nums[i];
				j++;
			}
		}

		nums[j++] = nums[nums.length - 1];
		return j;

	}
}
