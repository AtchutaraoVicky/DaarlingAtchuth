package SCANNER;

import java.util.Scanner;

public class LoginProgram {
public static void main(String[] args) {
	String username = "user@1";
	String password = "Test@123";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name");
	String name=sc.nextLine();
	System.out.println("Enter your password");
	String pass=sc.nextLine();
	if(name.equals(username)&&pass.equals(password)) {
		System.out.println("Succesfully Login");
	}
	else {
		System.out.println("Invalid Try again");
	}
}
}
