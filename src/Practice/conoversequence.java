package Practice;

public class conoversequence {
public static void main(String[] args) {
seq s= new seq('d',123.6f);
seq ss= new seq(1234.7f,'A');
}
}
 class seq
 {
	 char c; float f;
	 public seq(char c1, float f1)
	 {
		 c=c1; f= f1;
		 System.out.println(c+" "+f);
	 }
	 public seq(float f2, char c2)
	 {
		 c=c2; f=f2;
		 System.out.println(c+" "+f);
	 }
 }
