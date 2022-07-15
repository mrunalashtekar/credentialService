package com.glearning.pg.service;

public class CredentialService {

	//generate email address
	//generate password
	//display password
	public final static String generateEmailAddress(String firstname,String lastName,String dept) {
		String firstName = null;
		return firstName+"_"+lastName+"@"+dept+"company.com";
	}
 public final static String generatePassword(int length) {
	 String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+=/.?<>)";
		
		String seed = capitalLetters + smallLetters + numbers + specialCharacters;
		if(length < 8) {
			
		}
		char[] password = new char[length];
		for(int index = 0; index < length; index++) {
			int randomNumber = nextInt(seed.length());
			char c = seed.charAt(randomNumber);
			password[index]= c;
		}
		return String.copyValueOf(password);
		}
		
	private static int nextInt(int length) {
	// TODO Auto-generated method stub
	return 0;
}
	public static void showCredentials(Employee employee){
		System.out.println("==========="+employee.getFirstName() + " " + employee.getLastName()+"===========");
		System.out.println("First name" + employee.getFirstName());
		System.out.println("Last name" + employee.getLastName());
		System.out.println("Email address "+ employee.getEmailAddress());
		System.out.println("Password "+ employee.getPassword());
		System.out.println("================"+employee.getFirstName()+ " "+ employee.getLastName()+ "==========");

}
}
