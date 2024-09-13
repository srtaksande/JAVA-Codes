package Clone;

public class TestBox {

	public static void main(String[] args) {
		
		Box b1 = new Box (5, 8);
		Box b2 = new Box (5 ,9);
		
		System.out.println(b1.equals(b2));

	}

}
