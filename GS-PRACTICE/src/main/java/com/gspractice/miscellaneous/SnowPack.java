package com.gspractice.miscellaneous;

public class SnowPack {

	public static void main(String[] args) {
		Integer[] arr = { 0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0 };
		Integer[] arr1= {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		System.out.println(computeSnowpack(arr));
		//System.out.println(computeSnowpack(arr1));
	}

	public static Integer computeSnowpack(Integer[] arr) {
		if (null == arr || arr.length < 3)
			return 0;
		int res = 0;
		int maxLeft = 0;
		int maxRight = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			if (arr[left] < arr[right]) {
				if (arr[left] < maxLeft) {
					res += (maxLeft - arr[left]);
				} else {
					maxLeft = arr[left];
				}
				left++;
			} else {
				if (arr[right] < maxRight) {
					res += (maxRight - arr[right]);
				} else {
					maxRight = arr[right];
				}
				right--;
			}
		}

		return res;
	}

}
