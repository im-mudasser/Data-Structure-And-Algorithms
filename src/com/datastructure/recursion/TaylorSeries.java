package com.datastructure.recursion;

public class TaylorSeries {
	static double p = 1;
	static double f = 1;

	public static void main(String[] args) {
		double ans = taylorSeries(1, 10);
		System.out.println(ans);

	}

	public static double taylorSeries(int x, int n) { // O(n^2)
		double res = 0;
		if (n == 0) {
			return 1;
		}
		res = taylorSeries(x, n - 1);
		p = p * x;
		f = f * n;
		return res + p / f;

	}

}
