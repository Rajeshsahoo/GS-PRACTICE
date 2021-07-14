package com.gspractice.dp;

/*1.Here either we can move up and right
2.first will start from last row first column
3.from there will start filling first last row and 1st column
4.after filling we will fill remaining filed by finding the min element from both way */
public class OptimalPath {
	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } };

		System.out.println(solution(grid));
	}

	public static int solution(int[][] grid) {
		if (null == grid || 0 == grid.length || 0 == grid[0].length)
			return 0;

		int r = grid.length;
		int c = grid[0].length;

		for (int i = r - 1; i >= 0; i--) {
			for (int j = 0; j < c; j++) {
				if (i != (r - 1) && j > 0) {
					grid[i][j] += Math.max(grid[i + 1][j], grid[i][j - 1]);
				} else if (i != (r - 1)) {
					grid[i][j] += grid[i + 1][j];
				} else if (j > 0) {
					grid[i][j] += grid[i][j - 1];
				}
			}
		}

		return grid[0][c - 1];
	}
}
