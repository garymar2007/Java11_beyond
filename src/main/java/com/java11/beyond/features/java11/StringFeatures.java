package com.java11.beyond.features.java11;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class StringFeatures {

	public static boolean isBlank(String value) {
		//return value.trim().length() == 0; pre-Java11
		return value.isBlank();
	}
	
	public static String strip(String value) {
		//pre-Java11
		//return value.trim();
		return value.strip();
	}
	
	public static String stripLeading(String value) {
		//return value.replaceFirst("^\\s*", ""); pre-Java11
		return value.stripLeading();
	}
	
	public static String stripTrailing(String value) {
		//return value.replaceFirst("\\s++$", ""); pre-Java11
		return value.stripTrailing();
	}

	public static String repeat(String value, int times) {
		//pre-Java11
//		var result = "";
//		for(int x = 0; x < times; x++) {
//			result += value;
//		}
//
//		return result;

		return value.repeat(times);
	}
	
	public static Stream<String> lines(String value){
		//return Arrays.stream(value.split("\n")); pre-Java11
		return value.lines();
	}
}
