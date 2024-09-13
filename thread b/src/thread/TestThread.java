package thread;

public class TestThread {

	public static void main(String[] args) {

		threadA t1 = new threadA();
		t1.setName("First");
		threadA t2 = new threadA();
		t2.setName("Second");
		threadA t3 = new threadA();
		t3.setName("Third");
		threadA t4 = new threadA();
		t4.setName("Fourth");
		threadA t5 = new threadA();
		t5.setName("Fifth");
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	

	}

}
