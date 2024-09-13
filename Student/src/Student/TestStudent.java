package Student;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
	Marks S1 = new Marks();
	Scanner name = new Scanner(System.in);
	System.out.println("Enter your marks: ");
	S1.setMarks(name.nextDouble());
	S1.grade();
	

	}

}
