package Practice;

public class conoverdata {//Datatype cons overloading
public static void main(String[] args) {
datatype dd= new datatype(1234.76);
datatype dt= new datatype(20,134.8f);
}
}
 class datatype
 {
	 int i; float f;double d;
	 public datatype(double d1)
	 {
		 d=d1;
		 System.out.println(d);
	 }
	 public datatype(int i1,float f1)
	 {
		 i=i1;
		 f=f1;
		 System.out.println(i+" "+f);
	 }
 }
