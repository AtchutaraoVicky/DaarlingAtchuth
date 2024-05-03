package Practice;

public class parametercons {//Numaric
public static void main(String[] args) {
paranu pn= new paranu(20);
paranu pan= new paranu(50,40);
}
}
 class paranu
 {
	 int i; int j; int k;
	 public paranu(int k1)
	 {
		 k=k1;
		 System.out.println(k);
	 }
	 public paranu(int i1,int j1)
	 {
		 i=i1;j=j1;
		 System.out.println(i+" "+j);
	 }
 }
