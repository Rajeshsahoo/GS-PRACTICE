package com.gspractice.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		//String input = "apple";
		String input = "aappletty";
		System.out.println(findFirstNonRepeatingChar(input));
	}

	private static char findFirstNonRepeatingChar(String input) {
		char ch = 0;
		Map<Character,Integer> map = new LinkedHashMap();
		for(int i=0;i<input.length();i++) {
			if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}else {
				map.put(input.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				ch = entry.getKey();
				break;
			}
		}
		iterateMapAndDisplay(map);
		return ch;
	}

	private static void iterateMapAndDisplay(Map<Character, Integer> map) {
		StringBuffer buffer = new StringBuffer();
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			buffer.append(entry.getKey()+" : "+entry.getValue()+",");
		}
		buffer.deleteCharAt(buffer.length()-1);
		System.out.println(buffer.toString());
	}

}
