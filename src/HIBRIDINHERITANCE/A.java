package HIBRIDINHERITANCE;

class A {
int a=10;
public void data() {
	System.out.println("the data is "+a);
}
}
class B extends A{
int b=20;
int c=a+b;
public void sum() {
	System.out.println("the sum of "+c);
}
}
class C extends A{
	int d=2;
	int e=a*d;
	public void multification() {
		System.out.println("the multification of c  "+e);
	}
}
class D extends B{
	int f=100;
	int g=f/c;
	public void division() {
	System.out.println(" the division of "+g);
	}
}



