package com.glearning.pg.service;

import com.glearning.pg.service.Employee;
import com.glearning.pg.service.CredentialService;
import java.util.Scanner;

public class ProfileGeneratorClient {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your option");
		System.out.println("Admin = 0");
		System.out.println("HR = 1 ");
		System.out.println("Legal = 3 ");
		
		int option = scanner.nextInt();
		System.out.println("Enter your firstName");
		String firstName = scanner.next();
		
		System.out.println("Enter your lastName");
		String lastName = scanner.next();
		Employee employee = new Employee(firstName,lastName, lastName);
		switch (option) {
		case 0:
			employee.setDept("Admin");
			break;
		case 1:
			employee.setDept("HR");
			break;
		case 2 :
			employee.setDept("TEchnical");
			break;
		case 3 :
			employee.setDept("Legal");
			break;
		}
		//call the credential service
		String emailAddress = CredentialService.generateEmailAddress(firstName,lastName, employee.getDept());
		employee.setEmailAddress(emailAddress);
		System.out.println("Please enter the oassword length");
		int length = scanner.nextInt(radix:10);
		String password = CredentialService.generatePassword(length "10");
		employee.setPassword(password); 
		CredentialService.showCredentials(employee);
		
		
		//finally close
		scanner.close();
	}

}
