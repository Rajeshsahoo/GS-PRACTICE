package com.gspractice.string;

import java.util.HashMap;

public class LongestUniqueSubString {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		String s1= "abcabcd";
		System.out.println("The input String is " + s);
		int length = longestUniqueSubsttr(s1);
		System.out.println("The length of the longest non-repeating character substring is " + length);
	}

	private static int longestUniqueSubsttr(String s) {
		HashMap<Character,Integer> seen = new HashMap<Character, Integer>();
		int max_length = 0;
		int start = 0;
		for(int end=0;end<s.length();end++) {
			//if already there
			if(seen.containsKey(s.charAt(end))) {
				start = Math.max(start, seen.get(s.charAt(end))+1);
			}
			seen.put(s.charAt(end), end);
			max_length = Math.max(max_length, end-start+1);
		}
		return max_length;
	}

}
