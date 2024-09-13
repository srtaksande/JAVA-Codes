package StudentInheritence;

public class Student {
	
	int id;
	String name;
	float marks;
	
	public Student() {
	}

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void print()
	{
		System.out.println("ID = "+ id);
		System.out.println("Name = "+ name);
		System.out.println("Marks = "+ marks);
	}
	
	
	

}
