package com.gspractice.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rajeshkumar_Sahoo
 * program to find 3rd Non repeating character
 *
 */
public class Find3rdNonRepeatingCharcter {

	public static void main(String[] args) {
		System.out.println(_3rdNonRepeatingCharacter("aappletty"));
	}

	private static String _3rdNonRepeatingCharacter(String input) {
		String result = null;
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		int count = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				if (count == 2) {
					result = Character.toString(entry.getKey());
				}
				count++;
			}
		}
		return result;
	}

}
