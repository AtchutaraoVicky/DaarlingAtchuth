package HIBRIDINHERITANCE;

public class TEST {
public static void main(String[] args) {
	//create obj for class A
	A a= new A();
	a.data();
	
	
	//obj of class B
	B b= new B();
	System.out.println("the data of B"+b.b);
	b.sum();
	
	
	//obj of c
	C c=new C();
	System.out.println("the dada of C  "+c.d);
	c.multification();
	
	
	//obj of D
	D dd=new D();
	System.out.println("the data of D "+dd.f);
	dd.division();
}
}
