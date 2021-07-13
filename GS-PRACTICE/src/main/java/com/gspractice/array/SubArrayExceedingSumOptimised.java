package com.gspractice.array;

public class SubArrayExceedingSumOptimised {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = {};
		System.out.println(subArrayExceedsSum1(arr, 6));
	//	System.out.println(subArrayExceedsSum1(arr1, 0));
	//	System.out.println(subArrayExceedsSum1(arr, 12));
	}

	private static int subArrayExceedsSum1(int[] arr, int target) {
		if(null==arr || 0==arr.length)
			return 0;
		// Initialize current sum and minimum length
		int n=arr.length;
        int curr_sum = 0, min_len = n + 1;
 
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= target && end < n)
                curr_sum += arr[end++];
 
            // If current sum becomes greater than x.
            while (curr_sum > target && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;
 
                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        if(min_len==arr.length+1)
        	return -1;
        
        return min_len;
	}
}
