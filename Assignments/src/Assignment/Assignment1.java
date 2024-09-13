package Assignment;

public class Assignment1 {

	private int id;
	private String name;
	private float marks;

	public Assignment1() {
	}

	/**
	 * @param id
	 * @param name
	 * @param marks
	 */
	public Assignment1(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void CalcGrade() {
		if (marks >= 80) {
			System.out.println("\nDistinction");
		} else if (marks >= 60 && marks < 80) {
			System.out.println("\nA grade");
		} else if (marks >= 40 && marks < 60) {
			System.out.println("\nB grade");
		} else {
			System.out.println("\nFail");
		}
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return "ID = " + id + "\nName= " + name + "\nMarks= " + marks + "\n";

	}
	

}
