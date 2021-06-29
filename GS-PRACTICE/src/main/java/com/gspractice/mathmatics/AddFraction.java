package com.gspractice.mathmatics;

/**
 * @author Rajeshkumar_Sahoo
 * Program to find fraction value
 *
 */
public class AddFraction {

	public static void main(String[] args) {
		int[] fraction1 = { 1, 20 };
		int[] fraction2 = { 2, 15 };
		int[] result = findFraction(fraction1, fraction2);
		System.out.println(result[1] + "," + result[0]);
	}

	private static int[] findFraction(int[] fraction1, int[] fraction2) {
		int num1 = fraction1[0];
		int num2 = fraction2[0];
		int lcm = findLCM(fraction1[1], fraction2[1]);
		num1 = num1 * (lcm / fraction1[1]);
		num2 = num2 * (lcm / fraction2[1]);
		int result = num1 + num2;
		return new int[] { lcm, result };
	}

	private static int findLCM(int den1, int den2) {

		return (den1 * den2) / gcd(den1, den2);
	}

	private static int gcd(int den1, int den2) {
		if (den1 == 0)
			return den2;

		return gcd(den2 % den1, den1);
	}

}
