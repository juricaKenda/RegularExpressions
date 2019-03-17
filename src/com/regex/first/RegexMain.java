package com.regex.first;

import java.io.File;

public class RegexMain {

	
	public static void main(String[] args) {
		RegexHandler handler = new RegexHandler(new File("src\\regex.txt"));
		handler.findPattern(RegexHandler.titleNameTracker);
		handler.findPattern(RegexHandler.mailTracker);
		handler.findPattern(RegexHandler.dateTracker);
		
	}
}
