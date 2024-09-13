package StudentInheritence;

public class ExStudent extends Student {
	
	String job;
	float salary;

	public ExStudent() {
	}

	public ExStudent(int id, String name, float marks, String job, float salary) {
		super(id, name ,marks);
		this.job = job;
		this.salary = salary;
	}

	public void print()
	{
		super.print();
		System.out.println("Current Working Organization: " + job);
		System.out.println("Salary: " + salary);
	}
	
}
