package demo;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + : is concatenation operator
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Java";   
		
		double c = 12.10;
		double d = 10.20;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y); //300HelloJava
		System.out.println(x+y+a+b); //HelloJava100200
		
		System.out.println(x+y+(a+b)); // HelloJava300
		System.out.println(a+b+x+y+a+x+b+y); //300HelloJava100Hello200Java
		
		System.out.println(c+d); //22.30
		System.out.println(x+y+c+d); //

	}

}
