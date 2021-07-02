package com.gspractice.string;

/**
 * @author Rajeshkumar_Sahoo 
 * Make palindrum by removing one char at least
 *
 */
public class ValidPalindrumII {

	public static void main(String[] args) {
		System.out.println(palindrumII("abcbea"));
		System.out.println(palindrumII("abcda"));
		System.out.println(palindrumII(""));
	}

	private static boolean palindrumII(String input) {
		int left = 0;
		int right = input.length() - 1;
		while (left <= right) {
			if (input.charAt(left) != input.charAt(right)) {
				return isPalindrum(input, left + 1, right) || 
						isPalindrum(input, left, right - 1);
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean isPalindrum(String input, int left, int right) {
		while (left <= right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
