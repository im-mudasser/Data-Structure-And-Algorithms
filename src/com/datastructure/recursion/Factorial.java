package com.datastructure.recursion;

public class Factorial {

	public static void main(String[] args) {
		long res = fact(5);
		System.out.println(res);

	}

	private static long fact(long n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);

	}

}
