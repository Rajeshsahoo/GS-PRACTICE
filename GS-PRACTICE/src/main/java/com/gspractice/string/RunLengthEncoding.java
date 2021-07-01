package com.gspractice.string;

/**
 * @author Rajeshkumar_Sahoo
 * program -RunLengthEncoding
 *
 */
public class RunLengthEncoding {

	public static void main(String[] args) {
		System.out.println(rle("a"));
		System.out.println(rle("aa"));
		System.out.println(rle("aabb"));
		System.out.println(rle("aabbbaa"));

	}

	private static String rle(String input) {
		StringBuilder sb = new StringBuilder();
		int n = input.length();
		for (int i = 0; i < n; i++) {
			int count=1;
			while (i < n - 1 && input.charAt(i) == input.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(input.charAt(i));
			sb.append(count);
		}
		return sb.toString();
	}

}
