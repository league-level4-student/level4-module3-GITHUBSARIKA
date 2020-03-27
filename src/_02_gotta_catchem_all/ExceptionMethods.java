package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double x, double y) throws IllegalArgumentException {
		if(y==0) {
			throw new IllegalArgumentException();
		}
		return (x/y)*2;
		
	}
	
	String reverseString(String a) throws IllegalStateException {
		if(a.length()==0) {
			throw new IllegalStateException();
		}
		String b="";
		for (int i = 0; i < a.length(); i++) {
			b+=a.charAt(i);
			
		}
		
		
		return b;
		
	}
}
