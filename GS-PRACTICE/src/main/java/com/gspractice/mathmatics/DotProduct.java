package com.gspractice.mathmatics;

/**
 * @author Rajeshkumar_Sahoo
 * Program to find DOT product
 *
 */
public class DotProduct {
	public static void main(String[] args) {
		int[] array1 = { 2, 5 };
		int[] array2 = { 3, 4 };
		System.out.println(dotProduct(array1, array2));
	}

	private static int dotProduct(int[] array1, int[] array2) {
		int result = 0;
		for (int i = 0; i < array1.length; i++) {
			result += array1[i] * array2[i];
		}
		return result;
	}
}
