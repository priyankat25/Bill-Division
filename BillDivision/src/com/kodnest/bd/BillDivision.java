package com.kodnest.bd;

import java.util.Scanner;

public class BillDivision {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] costs = new int[n];

		for (int i = 0; i < n; i++) {
			costs[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		sc.close();
		int result = calculateRefundAmount(costs, k, b);
		if (result == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(result);
		}
	}

	public static int calculateRefundAmount(int[] costs, int notConsumedIndex, int totalPaid) {
		int totalCost = 0;
		for (int i = 0; i < costs.length; i++) {
			if (i != notConsumedIndex) {
				totalCost += costs[i];
			}
		}
		int actualShare = totalCost / 2;
		return totalPaid - actualShare;
	}
}