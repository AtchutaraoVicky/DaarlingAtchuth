package Practice;

public class arrays {
public static void main(String[] args) {
	//arrays is a data structure we can store the similar data type values deends on the array size
	//arrays is a two types,,1.static array,,2. dynamic array(iD array,2D array)
	//static array is nothing but we will give the size of array 
	//dynamic array we will con't give the size 

	//1D array(static array)
	int abc[]=new int[4];
	abc[0]=1;
	abc[1]=3;
	System.out.println(abc[0]);
	System.out.println(abc[1]);
	System.out.println(abc[2]);
	System.out.println(abc[3]);
	//1D array(dynamic array)
	char sdf[]= {'a','d'};
System.out.println(sdf[0]);
System.out.println(sdf[1]);
//2D array(static arry)
int xyz[][]=new int[2][3];
xyz[1][2]=30;
xyz[2][2]=30;
System.out.println(xyz[1][2]+" "+xyz[2][2]);
	
}
}
