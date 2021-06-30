package com.gspractice.string;

/**
 * @author Rajeshkumar_Sahoo
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		System.out.println("reverse the string :" + stringReverse("rajesh"));
		System.out.println("isPalindrum:" + isPalindrum("abba"));
		System.out.println("reverse string without moving special char" + reverseWitSpclChar("/gH?yZx"));
	}

	private static String reverseWitSpclChar(String input) {
		char[] ch = input.toCharArray();
		int l = 0;
		int r = ch.length - 1;
		while (l < r) {
			if (!Character.isAlphabetic(ch[l]))
				l++;
			else if (!Character.isAlphabetic(ch[r]))
				r--;
			else {
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;

			}
		}
		return new String(ch);
	}

	private static boolean isPalindrum(String input) {
		if (input.equals(stringReverse(input)))
			return true;
		return false;
	}

	private static String stringReverse(String input) {
		StringBuilder builder = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			builder.append(input.charAt(i));
		}
		return builder.toString();
	}
}
