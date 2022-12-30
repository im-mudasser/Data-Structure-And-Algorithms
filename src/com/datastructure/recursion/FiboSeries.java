package com.datastructure.recursion;

public class FiboSeries {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			long ans = fibo(i);
			System.out.print(ans + " ");
		}
	}

	private static long fibo(int n) {
		if (n <= 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);

	}

}
