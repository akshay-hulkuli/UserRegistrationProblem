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
	
	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First name :");
		String firstName = sc.nextLine();
		if(checkFirstName(firstName)) System.out.println("valid");
		else System.out.println("Invalid");
		
		System.out.println("enter Last name :");
		String lastName = sc.nextLine();
		if(checkLastName(lastName)) System.out.println("valid");
		else System.out.println("Invalid");
		
		System.out.println("enter email:");
		String email = sc.nextLine();
		if(checkEmail(email)) System.out.println("valid");
		else System.out.println("Invalid");
		sc.close();
		
	}
}
