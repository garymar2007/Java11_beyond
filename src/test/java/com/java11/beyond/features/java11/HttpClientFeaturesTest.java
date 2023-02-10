package com.java11.beyond.features.java11;

import static org.junit.jupiter.api.Assertions.*;

import com.java11.beyond.features.java11.HttpClientFeatures;
import org.junit.jupiter.api.Test;

class HttpClientFeaturesTest {

	@Test
	void sendGetTest() throws Exception {
		assertEquals(200, HttpClientFeatures.sendGet());
	}

}
