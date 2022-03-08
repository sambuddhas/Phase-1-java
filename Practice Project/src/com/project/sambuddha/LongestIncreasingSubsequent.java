package com.project.sambuddha;

public class LongestIncreasingSubsequent {

	public static int LIS(int[] arr, int i, int n, int prev)
	 {
	 if (i == n) {
	 return 0;
	 }
	 int excl = LIS(arr, i + 1, n, prev);
	 int incl = 0;
	 if (arr[i] > prev) {
	 incl = 1 + LIS(arr, i + 1, n, arr[i]);
	 }
	 return Integer.max(incl, excl);
	 }
	 public static void main(String[] args)
	 {
	 int[] arr = { 11, 6, 8, 21, 15, 16, 62, 25, 48, 32, 90,69,16 };
	 System.out.print("The length of the Longest Increasing Subsequent is "
	 + LIS(arr, 5, arr.length, Integer.MIN_VALUE));
	 }
	}
