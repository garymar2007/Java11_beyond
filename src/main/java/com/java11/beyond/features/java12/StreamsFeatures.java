package com.java11.beyond.features.java12;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsFeatures {

	public static String getRange(List<Integer> numbers) {
		

//		var min = numbers.stream().collect(Collectors.minBy(Integer::compare));
//		var max = numbers.stream().collect(Collectors.maxBy(Integer::compare));
//
//		BiFunction<Integer, Integer, String> biFunction = (v1, v2) -> String.format("%s - %s", v1, v2);
//
//		return biFunction.apply(min.get(), max.get());
		return numbers.stream().collect(Collectors.teeing(
				minBy(Integer::compare),
				maxBy(Integer::compare),
				(min, max) -> String.format("%s - %s", min.get(), max.get())
		));
		
	}
	
}
