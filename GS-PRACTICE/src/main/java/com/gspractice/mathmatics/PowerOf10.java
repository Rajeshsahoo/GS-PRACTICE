package com.gspractice.mathmatics;

/**
 * @author Rajeshkumar_Sahoo 
 * Program to verify a number is power of 10
 *
 */
public class PowerOf10 {

	public static void main(String[] args) {
		System.out.println(isPowerOf10(100));
	}

	private static boolean isPowerOf10(int input) {
		while (input >= 10 && input % 10 == 0) {
			input = input / 10;
		}
		return input == 1;
	}

}
