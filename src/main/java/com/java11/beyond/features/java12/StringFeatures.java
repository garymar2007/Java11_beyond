package com.java11.beyond.features.java12;

import java.util.function.Function;

public class StringFeatures {

	public static String indent(String value, int indent) {
		//return String.format("%1$" + (indent + value.length()) + "s", value);
		return value.indent(indent);
	}
	
	public static String transform(Function<String,String> transformation, String value) {
		//return transformation.apply(value);
		return value.transform(transformation);
	}
	
}
