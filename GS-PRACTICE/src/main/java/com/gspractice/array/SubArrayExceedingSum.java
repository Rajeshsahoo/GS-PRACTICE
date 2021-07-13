package com.gspractice.array;

public class SubArrayExceedingSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = {};
		System.out.println(subArrayExceedsSum1(arr, 6));
		System.out.println(subArrayExceedsSum1(arr1, 0));
		System.out.println(subArrayExceedsSum1(arr, 12));
	}

	public static int subArrayExceedsSum1(int arr[], int target) {
		if (null == arr || 0 == arr.length)
			return 0;
		
		int n = arr.length;
		int min_len = n + 1;
		for (int start = 0; start < n; start++) {
			int currSum = arr[start];
			if (currSum > target) {
				return 1;
			}

			for (int end = start + 1; end < n; end++) {
				currSum = currSum + arr[end];
				if (currSum > target && (end - start + 1) < min_len)
					min_len = (end - start + 1);
			}
		}
		if(min_len==arr.length+1)
			return -1;
		
		return min_len;
	}

}
