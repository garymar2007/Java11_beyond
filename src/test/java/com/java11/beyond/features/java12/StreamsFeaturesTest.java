package com.java11.beyond.features.java12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class StreamsFeaturesTest {

	@Test
	void getRangeTest() {

		var expected = "1 - 33";
		List<Integer> numbers = List.of(3,7,9,33,1,5,9);
		assertEquals(expected, StreamsFeatures.getRange(numbers));
		
	}

}
