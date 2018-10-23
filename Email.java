package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String companySuffix = "company.com";
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		System.out.println("Name: " + this.firstName + " " + this.lastName);
	
		
		// Call a method asking for the department and return it
		this.department = setDepartment();
		System.out.println("Department is: " + this.department);
	
		// Combine elements to generate email
		email = (firstName + "." + lastName + "@" +department + "." + companySuffix).toLowerCase(); 
		System.out.println("Your email is: " + email);
				
		// Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		this.mailboxCapacity = getMailboxCapacity();
		System.out.println("Mailbox capacity: " + this.mailboxCapacity);
		
		
	}
	
	
	// Ask for the department
	public String setDepartment() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nEnter the department code\n1 for Sales\n2 for Development\n3 for none\n");
		int depChoice = in.nextInt();
		
		switch (depChoice) {
			case 1:
				return "Sales";
			case 2: 
				return "Development";
			case 3:
				return "None";
			default:
				return "Not an opcion";
		}
		
	}
	
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] password = new char[length];
		
		// each loop saves a char of passwordSet to a new one
		for (int i=0; i<length; i++){
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		
		return new String(password);
	}
	
	
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	// set the alternateEmail
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	
	// Get mailbox capacity
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	// Get alternate email
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}

	
}



