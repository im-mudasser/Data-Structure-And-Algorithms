package com.datastructure.leetcode;

public class HappyNumber {

	public static boolean isHappy(int n) {

		int slow = n;
		int fast = n;
		do {
			slow = splitAndSquare(slow);
			fast = splitAndSquare(splitAndSquare(fast));
		} while (slow != fast);
		if (fast == 1 && slow == 1) {
			return true;
		}

		return false;

	}

	private static int splitAndSquare(int n) {
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans += rem * rem;
			n /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {

		System.out.println(isHappy(12));
	}
}
