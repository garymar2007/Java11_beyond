package com.java11.beyond.features.java13;

public class TextBlockPreviewFeatures {

	public static String getTextBlock() {

		//Pre-Java13
//		String multilineText =
//				  "  {\n"
//				+ "    \"course\":\"Migrating Beyond Java 8\",\n"
//				+ "    \"platform\":\"LinkedIn Learning\"\n"
//				+ "  }";

		String multilineText = """
					{
						"course": "Migration Beyond Java 8",
						"platform": "LinkedIn Learning"
					}
				""";

		System.out.println("Text Block:");

		return multilineText;
	}
	
	public static String stripIndent() {
		
		String multilineText =
				  "  {\n"
				+ "    \"course\":\"Migrating Beyond Java 8\",\n"
				+ "    \"platform\":\"LinkedIn Learning\"\n"
				+ "  }";

//		String multilineText = """
//					{
//						"course": "Migration Beyond Java 8",
//						"platform": "LinkedIn Learning"
//					}
//				""";
		System.out.println("\nBefore stripIndent:");
		System.out.println(multilineText);
		System.out.println("\nAfter stripIndent:");

		return multilineText.stripIndent();
	}
			
	public static String translateEscapes() {
		
		String multilineText = 
				  "  {\\n"
				+ "    \"course\":\"Migrating Beyond Java 8\",\\n"
				+ "    \"platform\":\"LinkedIn Learning\"\\n"
				+ "  }";

		System.out.println("\nBefore translateEscapes:");
		System.out.println(multilineText);
		System.out.println("\nAfter translateEscapes:");
		
		return multilineText.translateEscapes();
	}
	
	public static String formatted(String value1, String value2 ) {
		
		String multilineText = """
                {
                  "course":"%s",
                  "platform":"%s"
                }
                """;
		
		System.out.println("\nFormatted:");
		//return String.format(multilineText, value1, value2);
		return multilineText.formatted(value1, value2);
	}
}
