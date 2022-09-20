package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class Credentialservice {
	
	public char[]generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase= "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String chars = "!@#$%^&*()";
		String bigString = caps + lowerCase + number + chars;
        Random r = new Random();
        char []password = new char[8];
        for(int i=0;i<8;i++) {
        	password[i]= bigString.charAt(r.nextInt(bigString.length()));
        }
		return password;
		}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String firstName1 = firstName.toLowerCase();
				String lastName1 = lastName.toLowerCase();
		return firstName1+lastName1+"@"+department+".gl.com" ;
		
	}
	public void showCredentials(Employee emp, String email, char[]password) {
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email---> "+ email);
		System.out.println("Password---> "+ password);
	
	}
	

}