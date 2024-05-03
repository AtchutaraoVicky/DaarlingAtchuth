package SuperKeyword;

public class constructor_with_super {
public static void main(String[] args) {
	nanna nn= new nanna(50,'G');
}
}
class amma{
	int i; char c;
	public amma(int i1,char c1) {
		i=i1; c=c1;
		System.out.println(" i am a parent constructor"+"\n"+i+" \n"+c);
	}
}
class nanna extends amma{
	int i; char c;
	public nanna(int i1, char c1) {
		super(20,'A');
		i=i1; c=c1;
		System.out.println("i am child constructor"+"\n"+i+"\n"+c);
	}
}