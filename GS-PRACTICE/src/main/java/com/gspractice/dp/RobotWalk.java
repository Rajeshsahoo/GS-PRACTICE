package com.gspractice.dp;

/**
 * @author Rajeshkumar_Sahoo walking Robot problem
 */
public class RobotWalk {
	public static void main(String[] args) {
		Integer[] ans = walk("");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("L");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("UUU");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("ULDR");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("UDLRL");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("UDDLLRUUUDUURUDDUULLDRRRR");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// ans = walk("UDUDLRL");
		//System.out.println("[" + ans[0] + " " + ans[1] + "]");
		ans = walk1("UP DOWN 2XUP 3XDOWN LEFT RIGHT LEFT");
		System.out.println("[" + ans[0] + " " + ans[1] + "]");
		ans = walk2("UP DOWN 2XUP 40XDOWN 39XLEFT 69XRIGHT LEFT");
		System.out.println("[" + ans[0] + " " + ans[1] + "]");
		// UP DOWN 2XUP 3XDOWN LEFT RIGHT LEFT
		// UDLRL
		// UDLRL

		// UDUDLRL
	}

	private static Integer[] walk2(String path) {
		System.out.println("inside here");
		Integer[] xy = new Integer[2];
		xy[0] = 0;
		xy[1] = 0;
		if (path.length() == 0)
			return xy;

		char[] ch = path.toCharArray();
		for (int i = 0; i < ch.length; i++) {
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

	private static Integer[] walk(String path) {
		Integer[] xy = new Integer[2];
		int upCount = 0;
		int downCount = 0;
		int leftCount = 0;
		int rightCount = 0;
		for (char c : path.toCharArray()) {
			if (c == 'L') {
				leftCount++;
			} else if (c == 'R') {
				rightCount++;
			} else if (c == 'U') {
				upCount++;
			} else if (c == 'D') {
				downCount++;
			}
		}
		xy[0] = rightCount - leftCount;
		xy[1] = upCount - downCount;
		return xy;
	}

	private static Integer[] walk1(String str) {
		Integer[] xy = new Integer[2];
		int upCount = 0;
		int downCount = 0;
		int leftCount = 0;
		int rightCount = 0;
		String[] walk = str.split(" ");
		for (String s : walk) {
			if (s.contains("UP")) {
				upCount++;
			} else if (s.contains("DOWN")) {
				downCount++;
			} else if (s.contains("LEFT")) {
				leftCount++;
			} else if (s.contains("RIGHT")) {
				rightCount++;
			}
		}
		xy[0] = rightCount - leftCount;
		xy[1] = upCount - downCount;
		return xy;
	}
}
