package Casio;

import java.util.Scanner;


public class TestCalculator {

	public static void main(String[] args) {
		Calculator C1 = new Calculator();
		char op;
		
		Scanner name = new Scanner(System.in);
		System.out.println("Enter First Number:");
		C1.setA(name.nextDouble());
		System.out.println("Enter Second Number:");
		C1.setB(name.nextDouble());
		
		System.out.println("a for addition:");
		System.out.println("s for subtraction:");
		System.out.println("m for multiplication:");
		System.out.println("d for division:");
		
		System.out.println("Enter a choice:");
		op = name.next().charAt(0); // charAt(0) read first character of a string
		
		
		switch(op){
			case 'a' : 
				C1.Add();
				break;
			case 's' :
				C1.Sub();
				break;
			case 'm':
				C1.Mul();
				break;
			case 'd':
				C1.Div();
				break;
					
		}
		

	}

}
