package doubly;

public class TestDoubly {

	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		
		dList.addNode(10);
		dList.addNode(20);
		dList.addNode(30);
		dList.addNode(40);
		
		dList.displayNext();
		dList.displayPrev();

	}

}
