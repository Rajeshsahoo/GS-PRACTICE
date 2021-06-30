package com.gspractice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnarGram {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("cat");
		list.add("dog");
		list.add("god");
		group(list);
	}
	 static Set<Set<String>> group(List<String> data){
		 Set<Set<String>> set = new HashSet<>();
		 Map<String,List<String>> map = new HashMap<String,List<String>>();
		 for(String word : data) {
			 char[] letters = word.toCharArray();
			 Arrays.sort(letters);
			 String newWord = new String(letters);
			 if(map.containsKey(newWord)) {
				 map.get(newWord).add(word);
			 }else {
				 List<String> list = new ArrayList<>();
				 list.add(word);
				 map.put(newWord, list);
			 }
		 }
		return null;
	 }
}
