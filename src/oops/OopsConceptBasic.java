package oops;

public class OopsConceptBasic {

	//main method--> starting point of execution
	public static void main(String[] args) {

		OopsConceptBasic obj = new OopsConceptBasic();
		//one object will be created, obj is the ref variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object (obj)
		System.out.println("Main method");
		obj.adidas();
		int sum = obj.reebok();
		System.out.println(sum);
		String str = obj.puma();
		System.out.println(str);
		int b = obj.division(10, 5);
		System.out.println(b);

	}

	//Non-static methods
	// return type = void --> does not return any value 
	public void adidas() { // no input, no output
		System.out.println("adidas method");
	}

	// return type = int
	public int reebok() {  // no input, some output
		System.out.println("reebok method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("inside the method: "+c);
		return c;
	}

	// return type = String
	public String puma() { // no input, some output
		System.out.println("puma method");
		String s = "Selenium";

		return s;
	}

	public int division(int x, int y) { // some input, some output

		int d = x/y;

		return d;
	}

}
