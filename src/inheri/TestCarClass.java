package inheri;

public class TestCarClass {

	public static void main(String[] args) {
		
		//static polymorphism -  Compile-time Polymorphism
		Swift sw = new Swift();
		sw.start();
		sw.stop();
		sw.petrol();
		sw.sitting();
		
		
		System.out.println("---------------");
		Car ca = new Car();
		ca.start();
		ca.stop();
		ca.sitting();
		

	}

}
