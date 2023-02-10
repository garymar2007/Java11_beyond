package com.java11.beyond.features.java14;

public class SwitchStatementFeatures {

	public static boolean isFeedingTime(int hour) {

		boolean isFeedingTime;

		switch (hour) {
		case 2, 16, 21 -> isFeedingTime = true;
		default -> isFeedingTime = false;
		}
		
		return isFeedingTime;
	}
}
