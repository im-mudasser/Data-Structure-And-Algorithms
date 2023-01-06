package com.datastructure.recursion;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int sum = sumOfNaturalNUmbers(4);
		System.out.println(sum);
	}

	private static int sumOfNaturalNUmbers(int n) {

		if (n == 0) {
			return n;
		}

		return sumOfNaturalNUmbers(n - 1) + n;

	}

}
