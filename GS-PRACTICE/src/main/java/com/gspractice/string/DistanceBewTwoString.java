package com.gspractice.string;

/**
 * @author Rajeshkumar_Sahoo 
 * Program to find shortest distance between two  string
 *        
 *
 */
public class DistanceBewTwoString {
	public static void main(String[] args) {
		String document = "the quick the brown quick brown the frog";
		System.out.println(shortestDistance(document, "quick", "frog"));
	}

	private static int shortestDistance(String document, String firstString, String secondString) {
		if(firstString.equals(secondString)) {
			return 0;
		}
		String[] words = document.split(" ");
		int minDist = words.length+1;
		for(int index = 0;index<words.length;index++) {
			if(words[index].equals(firstString)) {
				for(int search = 0;search<words.length;search++) {
					if(words[search].equals(secondString)) {
						int currDistance = Math.abs(index-search)-1;
						if(currDistance<minDist)
							minDist = currDistance;
					}
				}
			}
		}
		return minDist;
	}
}
