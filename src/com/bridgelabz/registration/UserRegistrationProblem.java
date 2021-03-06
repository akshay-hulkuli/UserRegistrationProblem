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
	
	public static boolean checkMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("[1-9][0-9][\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public static boolean checkPassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9]).{8,}");
		Matcher matcher = pattern.matcher(password);
		if(!matcher.matches()) return false;
		pattern = Pattern.compile("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
		matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter First name :");
			String firstName = sc.nextLine();
			if(checkFirstName(firstName)) break;
			else System.out.println("Invalid");
		}
		
		while(true) {
			System.out.println("enter Last name :");
			String lastName = sc.nextLine();
			if(checkLastName(lastName)) break;
			else System.out.println("Invalid");
		}
		
		while(true) {
			System.out.println("enter email:");
			String email = sc.nextLine();
			if(checkEmail(email)) break;
			else System.out.println("Invalid");
		}
		
		while(true) {
			System.out.println("enter Mobile number:");
			String mobileNumber = sc.nextLine();
			if(checkMobileNumber(mobileNumber)) break;
			else System.out.println("Invalid");
		}
		
		while(true) {
			System.out.println("enter password:");
			String password = sc.nextLine();
			if(checkPassword(password)) break;
			else System.out.println("Invalid");
		}
		sc.close();
		
		
	}
}
