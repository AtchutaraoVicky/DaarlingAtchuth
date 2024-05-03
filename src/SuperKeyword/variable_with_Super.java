package SuperKeyword;

public class variable_with_Super {
public static void main(String[] args) {
	brother bb= new brother();
	bb.lucky();
}
}

class atchuth{
	int i=100;
   public void vicky () {
	   System.out.println(" i am a parent class"+" "+i);
   }
}
class brother extends atchuth{
	public void lucky() {
		System.out.println(super.i);
		System.out.println(" i am a child class");
		
	}
}