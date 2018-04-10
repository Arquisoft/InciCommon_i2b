package com.uniovi.test.util;

import org.junit.Test;

import com.uniovi.util.Checker;

public class CheckerTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsEmptyTrue() {
		Checker.isEmpty("");
	}
	
	@Test
	public void testIsEmptyFalse() {
		Checker.isEmpty("a");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsNullTrue() {
		Checker.isNull(null);
	}
	
	@Test
	public void testIsNullFalse() {
		Checker.isNull(new String());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsLessThanZeroNegative() {
		Checker.isLessThanZero(-5);
	}
	
	@Test
	public void testIsLessThanZeroPositive() {
		Checker.isLessThanZero(5);
	}
	
	@Test
	public void testIsLessThanZeroZero() {
		Checker.isLessThanZero(0);
	}
}
