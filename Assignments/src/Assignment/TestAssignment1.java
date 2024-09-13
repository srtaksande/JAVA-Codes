package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class TestAssignment1 {

	public static void main(String[] args) {
		//char number;
		int i;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Assignment1>student = new ArrayList<>();
		
		Assignment1 assignment = new Assignment1();
		//do
		for(i=1;i<=2; i++)
		{
		System.out.println("Enter Student ID:");
		int id = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Student Marks:");
		float marks = sc.nextFloat();
		
		assignment.setId(id);
		assignment.setName(name);
		assignment.setMarks(marks);
	
		student.add(new Assignment1(id, name, marks));
	
		//System.out.println("Do you want to add more data: y/n");
		//number = sc.next().charAt(0);
		//} while(number != 'n');
		
		}
		for (Assignment1 assignment1 : student) {	
			assignment1.CalcGrade();
			System.out.println(assignment1);		
		}
		
		float total = 0;
		for (Assignment1 assignment1 : student) {
		total += assignment1.getMarks();
		}
		float average = (total / (i - 1));
		System.out.println("Average Marks =" + average );
		
			
		}
		 		
		
		}
	
