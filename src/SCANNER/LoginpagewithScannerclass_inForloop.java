package SCANNER;

import java.util.Scanner;

public class LoginpagewithScannerclass_inForloop {
public static void main(String[] args) throws InterruptedException {
	String username="Atchutarao@luck";
	String password="Secure@125";
    
	//For loop
	for(int i=1;i<=8;i++) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The UserName");
	String name=s.nextLine();
	System.out.println("Enter The Password");
	String pass=s.nextLine();
	
	//loop start
	if(name.equals(username)&&pass.equals(password)) {
		System.out.println("Login Successfull..Ebter the Home page");
		break;
	}
	else if(i==3) {
		System.out.println("Userinput Does't Match...please give correct userinputs");
	}
	else if(i==6) {
		System.out.println("wait for 10 seconds");
		Thread.sleep(10000);
	}
	else if(i==8) {
		System.out.println("**...Error...**");
		System.out.println("===Account is Blocked===");
	}
	else {
	
		System.out.println("Error.....try again Please");
	}
	}
}
}
