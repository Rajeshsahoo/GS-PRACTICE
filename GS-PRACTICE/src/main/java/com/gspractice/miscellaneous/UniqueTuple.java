package com.gspractice.miscellaneous;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rajeshkumar_Sahoo
 * UniqueTuple
 *
 */
public class UniqueTuple {
	public static void main(String[] args) {
        System.out.println(uniqueTuples(  "abbccde",  2 ).toString());
    }

	private static Set<String> uniqueTuples(String str, int size) {
		
		Set<String> set = new HashSet<>();
		for (int j = 0; j < str.length() - 1; j++) {
			set.add(str.substring(j, j + size));
		}
		return set;
	}

   
}
