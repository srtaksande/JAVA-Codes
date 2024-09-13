package StudentInheritence;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Current cr = new Current();
		ExStudent ex = new ExStudent();

		char choice = 'o';

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 'c' if you are a current student OR Press 'e' if you are an Ex Student ");
		choice = sc.next().charAt(0);

		switch (choice) {
		case 'c':
			System.out.println("Enter Student ID: ");
			cr.id = sc.nextInt();
			System.out.println("Enter Student Name: ");
			cr.name = sc.next();
			System.out.println("Enter Student Marks: ");
			cr.marks = sc.nextFloat();
			System.out.println("Enter Scholarship Amount: ");
			cr.scholarship = sc.nextFloat();
			System.out.println("Enter Internship Organization: ");
			cr.internship = sc.next();
			cr.print();
			break;

		case 'e':
			System.out.println("Enter Student ID: ");
			ex.id = sc.nextInt();
			System.out.println("Enter Student Name: ");
			ex.name = sc.next();
			System.out.println("Enter Student Marks: ");
			ex.marks = sc.nextFloat();
			System.out.println("Enter Current Working Organization: ");
			ex.job = sc.next();
			System.out.println("Enter Current Salary: ");
			ex.salary = sc.nextFloat();
			ex.print();
			break;
		default:
			System.out.println("Invalid Entry");
		}

	}

}
