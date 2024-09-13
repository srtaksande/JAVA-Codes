package StudentInheritence;

public class Current extends Student {
	
	float scholarship;
	String internship;
	
	public Current() {
	}

	public Current(int id, String name, float marks, float scholarship, String internship) {
		super(id, name ,marks);
		this.scholarship = scholarship;
		this.internship = internship;
	}
	
	
	public void print()
	{
		super.print();
		System.out.println("Scholarship Amount: " + scholarship);
		System.out.println("Internship Organization: " + internship);
	}
	

}
