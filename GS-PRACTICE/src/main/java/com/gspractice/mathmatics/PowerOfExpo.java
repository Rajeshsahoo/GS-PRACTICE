package com.gspractice.mathmatics;

/**
 * @author Rajeshkumar_Sahoo 
 * Program to find power of exponent
 */
public class PowerOfExpo {

	public static void main(String[] args) {
		System.out.println(power(2.0, 4));
		System.out.println(power(3.0, 3));
	}

	private static double power(double base, int exp) {
		double result = 1;
		while (exp != 0) {
			result = result * base;
			exp--;
		}
		return result;
	}

}
