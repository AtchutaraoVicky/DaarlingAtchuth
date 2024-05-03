package Practice;

public class else_if_condition {
//this condition is used to the execute to the step by step
	public static void main(String[] args) {
	int	age=35;
		if(age<10) {
			System.out.println("child");
		}
		else if (age<25) {
			System.out.println("minor");
		}
		else if (age<40) {
			System.out.println("major");
		}
		else if (age<60) {
			System.out.println("old");
		}
		else {
			System.out.println("welcome to the smasanam");
		}
	}
}
