package com.gspractice.string;

/**
 * @author Rajeshkumar_Sahoo program to check pangram or not Pangram:if sentence
 *         contain all English alphabet
 *
 */
public class PanGram {

	public static void main(String[] args) {
		System.out.println(isPanGram("The quick brown fox jumps over the lazy dog"));
		System.out.println(isPanGram("The quick brown fox jumps over the dog"));
	}

	private static boolean isPanGram(String input) {
		boolean[] marks = new boolean[26];
		int index = 0;
		for (int i = 0; i < input.length(); i++) {
			if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
				index = input.charAt(i) - 'A';
			} else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
				index = input.charAt(i) - 'a';
			} else
				continue;
			marks[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (marks[i] == false)
				return false;
		}
		return true;
	}

}
