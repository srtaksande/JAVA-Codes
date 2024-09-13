package Student;


public class Marks {
	private double marks;

	public Marks() {
	}
	
	public Marks(double marks) {
		this.marks = marks;
	}
	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void grade() {
		
		if(marks < 40) {
			System.out.println("Fail");
			
		}
		else if (marks >= 40 && marks < 60) {
			System.out.println("Second Class");
		}
	else if (marks >= 60 && marks <= 100) {
		System.out.println("Distinction");	
	}
	else
		System.out.println("Invalid Entry");
}


}