package com.gspractice.dp;
/*Problem Statement:
There is a staircase with ‘n' number of steps. A child
walks by and wants to climb up the stairs, starting at
the bottom step and ascending to the top.
Of course, the child wants to have fun, too, so instead
of taking 1 step at a time, it will vary between taking
either 1, 2 or 3 steps at a time.
Please complete the ‘countSteps' method below so that
given 'n' number of steps it will return the number of
unique combinations the child could traverse.
An example would be countSteps(3) == 4:*/

public class StairCase {

	public static void main(String[] args) {
		System.out.println(countSteps(-5));
	}

	public static Integer countSteps(Integer n) {
		if (n <= 0)
			return 0;
		if (n <= 2)
			return n;

		int[] com = new int[n + 1];
		com[0] = 1;
		com[1] = 1;
		com[2] = 2;

		for (int i = 3; i < com.length; i++) {
			com[i] = com[i - 1] + com[i - 2] + com[i - 3];
		}
		return com[com.length - 1];
	}

}
