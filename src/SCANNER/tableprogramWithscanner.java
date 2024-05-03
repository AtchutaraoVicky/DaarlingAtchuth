package SCANNER;

import java.util.Scanner;

public class tableprogramWithscanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a table");
	int number=sc.nextInt();
	int m;
	for(int i=1;i<=20;i++) {
		m=number*i;
		System.out.println(number+"*"+i+" "+"="+m);
	}
}
}
