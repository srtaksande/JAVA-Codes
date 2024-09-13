import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
		try {
			int input;
			Scanner my_scanner = new Scanner(System.in);
			System.out.print("Enter the number : ");
			input = my_scanner.nextInt();
			System.out.println("Valid Number");
		} 
		
		catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
		
		finally {
			System.out.println("Finally Message !!!");
		}

	}

}
