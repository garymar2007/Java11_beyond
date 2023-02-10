package com.java11.beyond.features.java11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesFeatures {

	public static void writeString(String fileContent) throws IOException {

		//pre-Java11
//		var fileName = "example.txt";
//		var writer = new BufferedWriter(new FileWriter(fileName));
//		writer.write(fileContent);
//		writer.close();
		Files.writeString(Paths.get("example.text"), fileContent, StandardOpenOption.CREATE);
	}
	
	public static String readString(File file) throws IOException {

		//pre-Java11
//		var reader = new BufferedReader(new FileReader(file));
//
//		String line;
//		var fileContents = new StringBuilder();
//
//		while((line = reader.readLine()) != null) {
//			fileContents.append(line).append(System.lineSeparator());
//		}
//
//		reader.close();
//
//		return fileContents.toString().strip();

		return Files.readString(Paths.get(file.getPath()));
	}
}
