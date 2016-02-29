package com.bessadok.firas.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecimalRomanConvertorTest {

	@Test
	public void test_1_I() {
		assertEquals("I", DecimalRomanConvertor.roman(1));
	}
	
	@Test
	public void test_4_IV() {
		assertEquals("IV", DecimalRomanConvertor.roman(4));
	}

	@Test
	public void test_5_V() {
		assertEquals("V", DecimalRomanConvertor.roman(5));
	}

	@Test
	public void test_9_IX() {
		assertEquals("IX", DecimalRomanConvertor.roman(9));
	}

	@Test
	public void test_10_X() {
		assertEquals("X", DecimalRomanConvertor.roman(10));
	}

	@Test
	public void test_40_XL() {
		assertEquals("XL", DecimalRomanConvertor.roman(40));
	}

	@Test
	public void test_50_L() {
		assertEquals("L", DecimalRomanConvertor.roman(50));
	}

	@Test
	public void test_90_XC() {
		assertEquals("XC", DecimalRomanConvertor.roman(90));
	}

	@Test
	public void test_100_C() {
		assertEquals("C", DecimalRomanConvertor.roman(100));
	}

	@Test
	public void test_400_CD() {
		assertEquals("CD", DecimalRomanConvertor.roman(400));
	}

	@Test
	public void test_500_D() {
		assertEquals("D", DecimalRomanConvertor.roman(500));
	}

	@Test
	public void test_900_CM() {
		assertEquals("CM", DecimalRomanConvertor.roman(900));
	}

	@Test
	public void test_1000_M() {
		assertEquals("M", DecimalRomanConvertor.roman(1000));
	}
}
