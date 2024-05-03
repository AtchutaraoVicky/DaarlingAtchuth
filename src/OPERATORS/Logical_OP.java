package OPERATORS;

public class Logical_OP {
public static void main(String[] args) {
	int a=30;
	int b=20;
	int x=50;
	int y=30;
	System.out.println("(||)OR OPerator");
	System.out.println(a<b||a>b);
	System.out.println(a==y||y<x);
	System.out.println(a!=y||x<a);
	
	System.out.println("(&&)AND OPerator");
	System.out.println(a>b&&b<y);
	System.out.println(a==b&&x<y);
	System.out.println(a>b&&y>x);
	
}
}
