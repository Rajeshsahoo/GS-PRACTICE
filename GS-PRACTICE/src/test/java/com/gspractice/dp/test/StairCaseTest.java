package com.gspractice.dp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gspractice.dp.StairCase;

public class StairCaseTest {
	@Test
	void test() {
		assertEquals(0, StairCase.countSteps(-5));
		assertEquals(0, StairCase.countSteps(0));
		assertEquals(2, StairCase.countSteps(2));
		assertEquals(4, StairCase.countSteps(3));
		assertEquals(7, StairCase.countSteps(4));
		assertEquals(13,StairCase.countSteps(5));
	}
}
