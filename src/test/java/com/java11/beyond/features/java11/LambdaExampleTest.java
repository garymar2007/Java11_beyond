package com.java11.beyond.features.java11;

import static org.junit.jupiter.api.Assertions.*;

import com.java11.beyond.features.java11.LambdaExample;
import org.junit.jupiter.api.Test;

class LambdaExampleTest {

	@Test
	void varWithLambdaTest() {
	
		var expected = "LinkedIn Learning!";
		var result = LambdaExample.varWithLambda(expected.split(" ")[0], expected.split(" ")[1]);
		
		assertEquals(expected, result);
	}

}
