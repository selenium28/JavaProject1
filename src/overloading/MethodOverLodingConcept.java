package overloading;

public class MethodOverLodingConcept {

	public static void main(String[] args) {

		MethodOverLodingConcept obj = new MethodOverLodingConcept();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}

	public static void main(int p) {

	}

	public static void main(int q, int r) {

	}

	//you can not create a method inside a method
	//duplicate methods-- same method name with same no of arguments are not allowed

	//method overloading-- When the method name is same with different arguments or input parametes within the same class

	public void sum() { // 0 parameters
		System.out.println("SUM method--- 0 input parameter");

	}

	public void sum(int i) { // 1 parameters
		System.out.println("SUM method---- 1 input parameter");
		System.out.println(i);
	}

	public void sum(int m, int n) { // 2 parameters
		System.out.println("SUM method---- 2 input parameter");
		System.out.println(m+n);
	}
}
