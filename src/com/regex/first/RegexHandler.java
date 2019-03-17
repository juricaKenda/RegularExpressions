package com.regex.first;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHandler {

	private String inputString;
	private Pattern regexPattern;
	private Matcher matcher;
	public static final String mailTracker = "(\\w{1,})([. -]?)(\\w{0,})[@]([A-Za-z]{1,})(\\.)(\\w{1,})";
	public static final String titleNameTracker = "((Mr)|(mr))(s?)(.?)(\\s?)([A-Za-z]{0,})(\\s?)([A-z]{0,})";
	public static final String dateTracker ="(([0-9]{2,4})([\\\\.-]{1})){2}([0-9]{2,4})";
	
	public RegexHandler(File file) {
		this.inputString = this.extractFromFile(file);
	}
	
	
	public void findPattern(String chosenPattern) {
		System.out.println("-------------------");
		this.regexPattern = Pattern.compile(chosenPattern);
		this.matcher = this.regexPattern.matcher(inputString);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	
	public static String extractFromFile(File file) {
		StringBuffer buffer = new StringBuffer();
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()) {
				buffer.append(input.nextLine()+"\n");
			}
			
		}catch(IOException e) {
			
		}
	return buffer.toString();
	}
}
