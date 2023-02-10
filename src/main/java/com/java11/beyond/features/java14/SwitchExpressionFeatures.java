package com.java11.beyond.features.java14;

public class SwitchExpressionFeatures {

	public static boolean isFeedingTime(int hour) {

		return switch (hour) {
			case 2, 16, 21 -> true;
			default -> {
				System.out.println("Meow! Is it feeding time yet?");
				yield false;
			}
		};
	}
}
