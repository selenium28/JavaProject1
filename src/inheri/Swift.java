package inheri;

public class Swift extends Car{
	
	// Inheritance (Is -A relationship)
	// It is inheriting the properties of parent class into child class is known as Inheritance
	
	//When same method is present in parent class as well as child class with the same name and same no. of arguments is called as Method-Overriding.  
	public void start() {  // overriden method
		System.out.println("Swift ----- start");
		
	}
	
	public void petrol() {
		System.out.println("Swift ----- petrol");
		
	}

}
