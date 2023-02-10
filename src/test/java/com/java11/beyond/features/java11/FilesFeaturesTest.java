package com.java11.beyond.features.java11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import com.java11.beyond.features.java11.FilesFeatures;
import org.junit.jupiter.api.Test;

class FilesFeaturesTest {

	@Test
	void writeStringTest() throws IOException {
		
		FilesFeatures.writeString("LinkedIn Learning!");
		var file = new File("example.text");

		assertNotNull(file);
		assertTrue(file.getTotalSpace() > 0);
		
	}
	
	@Test
	void readStringTest() throws IOException {
	
		var expected = "LinkedIn Learning!";
		FilesFeatures.writeString(expected);
		
		var fileContents = FilesFeatures.readString(new File("example.text"));
		
		assertEquals(expected, fileContents);
	}

}
