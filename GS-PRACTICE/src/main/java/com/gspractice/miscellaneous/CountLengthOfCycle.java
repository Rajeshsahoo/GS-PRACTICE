package com.gspractice.miscellaneous;

/**
 * @author Rajeshkumar_Sahoo
 
 */
/*
Problem Statement:
     You are given an integer array of size N.
     Every element of the array is greater than or equal to 0.
     Starting from arr[startIndex], follow each element to the index it points to.
     Continue to do this until you find a cycle.
     Return the length of the cycle. If no cycle is found return -1
     Examples:
Signature:
Int countLengthofcycle(arr, startIndex){
}
Test Cases:
Input :
arr: [1,0]
startIndex: 0
Output :2
Input :
arr: [1,2,0]
startIndex: 0
Output :3
*/
public class CountLengthOfCycle {

	public static void main(String[] args) {
		System.out.println(countLengthOfCycle(new int[] { 1, 0 }, 0));
		System.out.println(countLengthOfCycle(new int[] { 1, 2, 0 }, 0));
		System.out.println(countLengthOfCycle(new int[] { 1, 2, 3 }, 0));
		System.out.println(countLengthOfCycle(new int[] { 1, 2, 0 }, 5));
	}

	private static int countLengthOfCycle(int[] arr, int startIndex) {
		if (startIndex >= arr.length) {
			return -1;
		}

		int N = arr.length;
		int current = startIndex;
		boolean[] visisted = new boolean[N];
		int c = 0;
		while (!visisted[current]) {
			visisted[current] = true;
			current = arr[current];
			if (current >= N)
				return -1;
			c++;
		}
		return c;
	}

}
