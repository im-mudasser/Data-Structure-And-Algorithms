package com.datastructure.recursion;

import java.util.Arrays;

// O(n)
public class OptimizeFiboSeries {
	static int arr[];

	public OptimizeFiboSeries(int size) {
		arr = new int[size];
		Arrays.fill(arr, -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptimizeFiboSeries(5);
		int res = OptimizeFiboSeries.fibo2(5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(res);
	}

	private static int fibo2(int n) {

		if (n <= 1) {
			arr[n] = n;
			return n;
		} else {
			if (arr[n - 2] == -1) {
				arr[n - 2] = fibo2(n - 2);
			}
			if (arr[n - 1] == -1) {
				arr[n - 1] = fibo2(n - 1);
			}
			return arr[n - 2] + arr[n - 1];
		}
	}
}
