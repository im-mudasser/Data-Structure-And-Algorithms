package com.datastructure.recursion;

public class FiboSeries {
	// 2^n complexity approx
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			int ans = fibo(i);
			System.out.print(ans + " ");
		}

	}

	private static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);

	}

}
