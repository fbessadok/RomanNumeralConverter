package com.bessadok.firas.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class DecimalRomanConvertor {

	private static Map<String, Integer> convertor = new LinkedHashMap<String, Integer>();

	static {
		convertor.put("M", 1000);
		convertor.put("CM", 900);
		convertor.put("D", 500);
		convertor.put("CD", 400);
		convertor.put("C", 100);
		convertor.put("XC", 90);
		convertor.put("L", 50);
		convertor.put("XL", 40);
		convertor.put("X", 10);
		convertor.put("IX", 9);
		convertor.put("V", 5);
		convertor.put("IV", 4);
		convertor.put("I", 1);
	}

	private DecimalRomanConvertor() {};

	public static String roman(int nbr) {
		String result = "";
		for (Map.Entry<String, Integer> entry : convertor.entrySet()) {
			String romanNumeral = entry.getKey();
			Integer decimal = entry.getValue();
			while (nbr >= decimal) {
				result += romanNumeral;
				nbr -= decimal;
			}
		}
		return result;
	}
}
