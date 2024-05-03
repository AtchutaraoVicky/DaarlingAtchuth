package SCANNER;

import java.util.Scanner;

public class MY_DETAILS {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter My Details");
	System.out.println("Enter Your Name");
	//input String
	String name=ss.nextLine();
	System.out.println("Enter Your Father Name");
	//input String
	String Fathername=ss.nextLine();
	System.out.println("Enter your Mother Name");
	//input String
	String Mothername=ss.nextLine();
	System.out.println("Enter your mobile Number");
	//input String
	String mobileno=ss.nextLine();
	System.out.println("Enter Your Email_Id");
	//input String
	String mail=ss.nextLine();
	System.out.println("Enter Your Gender");
	//input String
	String gender=ss.nextLine();
	System.out.println("Enter Your Age");
	//input int
	int age=ss.nextInt();
	
	
	
	//Report printing
	System.out.println("Name ="+name);
	System.out.println("FatherName ="+Fathername);
	System.out.println("MotherName ="+Mothername);
	System.out.println("Mobilenumber ="+mobileno);
	System.out.println("Mail ="+mail);
	System.out.println("Gender ="+gender);
	System.out.println("Age ="+age);
	
}
}
