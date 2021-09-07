package com.bridgelabz.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	
	public static boolean checkFirstName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
	
	public static boolean checkLastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First name :");
		if(checkFirstName(sc.nextLine())) System.out.println("valid");
		else System.out.println("Invalid");
		
		System.out.println("enter Last name :");
		if(checkLastName(sc.nextLine())) System.out.println("valid");
		else System.out.println("Invalid");
		
		sc.close();
		
	}
}
