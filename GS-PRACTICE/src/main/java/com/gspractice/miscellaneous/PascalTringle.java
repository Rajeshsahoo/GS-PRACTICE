package com.gspractice.miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajeshkumar_Sahoo Pascal Tringle problem
 *
 */
public class PascalTringle {

	public static void main(String[] args) {
		printPascal(5);
		System.out.println(storePascalInList(5));
	}

	private static List<List<Integer>> storePascalInList(int n) {
		List<List<Integer>> pascalList = new ArrayList<>();
		List<Integer> list = null;
		for (int line = 1; line <= n; line++) {
			list = new ArrayList<Integer>();
			int c = 1;
			for (int i = 1; i <= line; i++) {
				list.add(c);
				c = c * (line - i) / i;
			}
			pascalList.add(list);
		}
		return pascalList;
	}

	// Pascal function
	private static void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			int c = 1;
			for (int i = 1; i <= line; i++) {
				System.out.print(c + " ");
				c = c * (line - i) / i;
			}
			System.out.println();
		}
	}

}
