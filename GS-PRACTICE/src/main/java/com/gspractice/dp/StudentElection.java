package com.gspractice.dp;

public class StudentElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2, 2));

	}
	public static int solution(int n, int k) {
		if(1 == n)
			return 1;
		
		return ((solution(n - 1, k) + k - 1)) % n + 1;
	}
}
