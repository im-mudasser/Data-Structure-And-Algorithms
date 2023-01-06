package com.datastructure.recursion;

public class ExponentFunction {

	public static void main(String[] args) {
		int ans = pow(2, 5);
		System.out.println(ans);

	}

	/*
	 * private static int pow(int m, int n) {
	 * 
	 * if (n == 1) { return n; } return pow(m, n - 1) * m;
	 * 
	 * }
	 */

	// optimize recursion
//	private static int pow(int m, int n) {
//
//		if (n == 0) {
//			return 1;
//		}
//		if (n % 2 == 0) {
//			return pow(m * m, n / 2);
//		} else {
//			return pow(m * m, (n - 1) / 2) * m;
//		}
//
//	}

	// loop
	private static int pow(int m, int n) {
		int power = 1;
		for (int i = 1; i <= n; i++) {
			power = power * m;
		}
		return power;
	}

}
