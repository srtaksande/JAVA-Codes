package circular;

public class TestCircular {

	public static void main(String[] args) {
		CircularLinkedList cir = new CircularLinkedList();
		
		cir.add(10);
		cir.add(20);
		cir.add(30);
		cir.add(40);
		cir.add(50);
		
		cir.display();
	}

}
