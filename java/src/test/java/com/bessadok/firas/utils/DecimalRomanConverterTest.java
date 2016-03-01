package com.bessadok.firas.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecimalRomanConverterTest {

	@Test
	public void test_1_I() {
		assertEquals("I", DecimalRomanConverter.roman(1));
	}
	
	@Test
	public void test_4_IV() {
		assertEquals("IV", DecimalRomanConverter.roman(4));
	}

	@Test
	public void test_5_V() {
		assertEquals("V", DecimalRomanConverter.roman(5));
	}

	@Test
	public void test_9_IX() {
		assertEquals("IX", DecimalRomanConverter.roman(9));
	}

	@Test
	public void test_10_X() {
		assertEquals("X", DecimalRomanConverter.roman(10));
	}

	@Test
	public void test_40_XL() {
		assertEquals("XL", DecimalRomanConverter.roman(40));
	}

	@Test
	public void test_50_L() {
		assertEquals("L", DecimalRomanConverter.roman(50));
	}

	@Test
	public void test_90_XC() {
		assertEquals("XC", DecimalRomanConverter.roman(90));
	}

	@Test
	public void test_100_C() {
		assertEquals("C", DecimalRomanConverter.roman(100));
	}

	@Test
	public void test_400_CD() {
		assertEquals("CD", DecimalRomanConverter.roman(400));
	}

	@Test
	public void test_500_D() {
		assertEquals("D", DecimalRomanConverter.roman(500));
	}

	@Test
	public void test_900_CM() {
		assertEquals("CM", DecimalRomanConverter.roman(900));
	}

	@Test
	public void test_1000_M() {
		assertEquals("M", DecimalRomanConverter.roman(1000));
	}

	@Test
	public void test_1954_MCMLIV() {
		assertEquals("MCMLIV", DecimalRomanConverter.roman(1954));
	}

	@Test
	public void test_1990_MCMXC() {
		assertEquals("MCMXC", DecimalRomanConverter.roman(1990));
	}

	@Test
	public void test_2016_MMXVI() {
		assertEquals("MMXVI", DecimalRomanConverter.roman(2016));
	}
}
