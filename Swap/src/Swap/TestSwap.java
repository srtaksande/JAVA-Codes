package Swap;

public class TestSwap {

	public static void main(String[] args) {
		

		SwapNumber e1 = new SwapNumber();
		e1.a= 10;
		e1.b = 20;
		e1.swap = e1.a;
		e1.a = e1.b;
		e1.b = e1.swap;
		
		e1.Swap();

	}

}
