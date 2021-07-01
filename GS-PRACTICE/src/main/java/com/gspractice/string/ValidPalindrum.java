package com.gspractice.string;

public class ValidPalindrum {
	public static void main(String[] args) {
		System.out.println(isPalindrum("aaa"));
		System.out.println(isPalindrum("aba"));
		System.out.println(isPalindrum("anc"));
	}

	private static boolean isPalindrum(String input) {
		int left = 0;
		int right = input.length()-1;
		boolean isPalindrum = true;
		while(left<=right) {
			if(input.charAt(left)!=input.charAt(right)) {
				isPalindrum = false;
				break;
			}
			left++;
			right--;
		}
		return isPalindrum;
	}
}
