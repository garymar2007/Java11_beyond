package com.java11.beyond.features.java14;

public class NullPointerFeatures {

	public static RecordsFeature.Cat causeNullPointer() {
		return new RecordsFeature.Cat(null,5);
	}
}
