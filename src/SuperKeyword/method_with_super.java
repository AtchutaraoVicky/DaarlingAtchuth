package SuperKeyword;

public class method_with_super {
public static void main(String[] args) {
	sam ss= new sam();
	ss.lucky();
}
}
class ram{
	int i=100;
	public void vicky() {
		System.out.println("mobile,car,bike"+i );
	}
}
class sam extends ram{
	public void lucky() {
		super.vicky();
		System.out.println("watch,ring,earbuds");
	}
}