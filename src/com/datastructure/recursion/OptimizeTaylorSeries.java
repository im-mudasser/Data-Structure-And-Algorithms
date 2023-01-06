package com.datastructure.recursion;

public class OptimizeTaylorSeries {
	static double res = 1.0;

	public static void main(String[] args) {
		double ans = OptimizeTaylorSeries.taylorSeries(1, 10);
		System.out.println(ans);

	}

	public static double taylorSeries(int x, int n) { // O(n)

		if (n == 0) {
			return res;
		}
		res = 1 + x / n * res;
		return taylorSeries(x, n - 1);

	}

}
