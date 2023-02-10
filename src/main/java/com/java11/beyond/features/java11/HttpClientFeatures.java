package com.java11.beyond.features.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientFeatures {

	public static int sendGet() throws IOException, Exception {

		var client = HttpClient.newHttpClient();
		var url = new URL("https://www.linkedin.com/learning/");
		var request = HttpRequest.newBuilder().GET().uri(url.toURI()).build();

		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response);
		return response.statusCode();
		//pre-Java11
//		var connection = (HttpURLConnection) url.openConnection();
//		connection.setRequestMethod("GET");
//
//		int statusCode =  connection.getResponseCode();
//
//		var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//		String responseLine;
//		var responseBody = new StringBuilder();
//
//		while((responseLine = reader.readLine()) != null) {
//			responseBody.append(responseLine).append(System.lineSeparator());
//		}
//
//		System.out.println(responseBody);
//
//		connection.disconnect();
//		return statusCode;
	}
	
}
