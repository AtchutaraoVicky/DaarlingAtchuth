package STRING;

public class METHODS {
public static void main(String[] args) {
	
	//equals method
	String s= new String("hyderabad");
	String s1= new String("hyderabad");
	if(s.equals(s1)) {
		System.out.println("value are same");
	}
	else {
		System.out.println(" values are not same");
	}
	
	//== operator method
	String a= new String("hyderabad");
	String a1= new String("hyderabad");
	if(a==a1) {
		System.out.println("value are same");
	}
	else {
		System.out.println(" values are not same");
	}
	
	//concat method
	String b= new String("hyderabad");
	String b1= new String("hyderabad");
	System.out.println(b.concat(b1));
	
	//length method

    String c= new String("hyderabad");
    String c1= new String("hyderabad");
    System.out.println(c.length());
    
    //charAt method
 
    String d= new String("hyderabad");
	String d1= new String("hyderabad");
	System.out.println(d.charAt(5));
	
	//subString method
	
	String e= new String("hyderabad");
	String e1= new String("hyderabad");
	System.out.println(e.substring(3,6));
	
	//toLowerCase method
	
	String h= new String("HYDERABAD");
	String h1= new String("hyderabad");
	System.out.println(h.toLowerCase());
	
	//toUpperCase method
	
	
	String i= new String("hyderabad");
	String i1= new String("hyderabad");
	System.out.println(i.toUpperCase());
	
	//in StringBuffermethod append method
	
	StringBuffer f= new StringBuffer("hyderabad");
	StringBuffer f1= new StringBuffer("hyderabad");
	System.out.println(f.append(f1));
	System.out.println(f);
	
	//in StringBuffermethod insert method
	
	StringBuffer g= new StringBuffer("hyderabad");
	StringBuffer g1= new StringBuffer("hyderabad");
	System.out.println(g.insert(5,"vicky"));
	
	//in StringBuffermethod reverse method
	
	StringBuffer j= new StringBuffer("hyderabad");
	StringBuffer j1= new StringBuffer("hyderabad");
	System.out.println(j.reverse());


	
	
	
	

}
}
