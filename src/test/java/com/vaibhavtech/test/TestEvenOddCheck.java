package com.vaibhavtech.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.vaibhavtech.EvenOddCheck;

public class TestEvenOddCheck {
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	public void isEvenOrOddTest(String input, String expected) {
		EvenOddCheck evenOddCheck = new EvenOddCheck();
		String actual = evenOddCheck.isEvenOrOdd(Integer.parseInt(input));
		assertEquals(expected, actual);
	}
}
