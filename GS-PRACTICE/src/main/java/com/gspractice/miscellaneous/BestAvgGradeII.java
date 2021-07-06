package com.gspractice.miscellaneous;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rajeshkumar_Sahoo 
 * Best Average Grade
 *
 */
public class BestAvgGradeII {

	public static void main(String[] args) {
		String[][] students = { { "Bob", "87" }, { "Mike", "35" }, { "Bob", "52" }, { "Jason", "35" }, { "Mike", "55" },
				{ "Jessica", "99" } };
		int max = Integer.MIN_VALUE;
		Map<String, Integer> count = new HashMap<>();
		Map<String, Integer> sum = new HashMap<>();
		for (int i = 0; i < students.length; i++) {
			int avg = 0;
			if (count.containsKey(students[i][0])) {
				int currCount = count.get(students[i][0]);
				currCount++;
				count.put(students[i][0], currCount);

				int currSum = sum.get(students[i][0]);
				currSum += Integer.valueOf(students[i][1]);
				sum.put(students[i][0], currSum);

				avg = currSum / currCount;

			} else {
				count.put(students[i][0], 1);
				sum.put(students[i][0], Integer.valueOf(students[i][1]));
				avg = Integer.valueOf(students[i][1]);
			}
			max = Math.max(max, avg);
		}
		System.out.println("Average value :" + max);

	}

}
