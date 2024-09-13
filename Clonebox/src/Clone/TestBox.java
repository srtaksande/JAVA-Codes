package Clone;

public class TestBox {

	public static void main(String[] args) throws Exception {
		
		
		Box b1 = new Box (5, 4);
		Box b2 = (Box) b1.clone();
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.setBreadth(3);
		
		
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
