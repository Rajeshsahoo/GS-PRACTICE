package com.gspractice.dp;

public class WalkingRobotSingleMovement {
	private static Integer[] getRobotCoordinates(String path) {

		Integer[] coordinates = new Integer[2];
		coordinates[0] = 0;
		coordinates[1] = 0;

		if (path.isEmpty()) {
			return coordinates;

		}

		for (int i = 0; i < path.length(); i++) {
			char ch = path.charAt(i);

			switch (ch) {
			case 'U':
				coordinates[1]++;
				break;

			case 'D':
				coordinates[1]--;
				break;

			case 'L':
				coordinates[0]--;
				break;

			case 'R':
				coordinates[0]++;
				break;

			}

		}

		return coordinates;

	}

	public static void main(String[] args) {

		String path = "UP DOWN 2XUP 40XDOWN 39XLEFT 69XRIGHT LEFT ";

		Integer[] coordinates = getRobotCoordinates(path);

		System.out.println(coordinates[0]);
		System.out.println(coordinates[1]);
		
		Integer[] coordinates1 =  walk2(path);
		System.out.println(coordinates1[0]);
		System.out.println(coordinates1[1]);

	}

	private static Integer[] walk2(String path) {
		Integer[] xy = new Integer[2];
		xy[0] = 0;
		xy[1] = 0;
		if (path.length() == 0)
			return xy;

		char[] ch = path.toCharArray();
		for (int i = 0; i < path.length(); i++) {
			switch (ch[i]) {
			case 'U':
				xy[1]++;
				break;
			case 'D':
				xy[1]--;
				break;
			case 'L':
				xy[0]--;
				break;
			case 'R':
				xy[0]++;
				break;
			}
		}
		return xy;
	}
}
