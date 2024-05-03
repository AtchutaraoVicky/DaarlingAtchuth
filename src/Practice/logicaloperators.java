package Practice;

public class logicaloperators {
//this is used to the conditions with execute the true are false
	public static void main(String[] args) {
		//&&(and_op)..this operator is used to the both condition satisfied
		//||(Or_op)..this  operator is used to the any one condition satisfied
		//it follows the truth table and it will execute the output in true or false
		int a=10;
		int b=60;
		int x=78;
		int y=80;
		System.out.println(a<=b&&x<=y);
		System.out.println(a!=b||x<=y);
	}
}
