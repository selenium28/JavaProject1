package encap;

public class EncapsulationConcept {

	//Encapsulation is also called data hiding
	
	//private data variables: Can't accessed directly from outside the class
	private int srno;
	private String name;
	private int age;

	public static void main(String[] args) {

		EncapsulationConcept objencp = new EncapsulationConcept();
		objencp.setSrno(123);
		objencp.setAge(20);
		objencp.setName("Tejashree");
		
		System.out.println("Name of Candidate: " +objencp.getName());
		System.out.println("SrNo of Candidate: " +objencp.getSrno());

	}

	// public getter and public setter mothods.
	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
