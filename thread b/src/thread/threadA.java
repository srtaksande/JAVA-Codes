package thread;

public class threadA extends Thread{

	@Override
	public void run() {
		System.out.println("starting Thread..." + getName());
		for (int i=1; i <=20; i++) {
			System.out.println( getName() + "=========>" +i);
		}
		
		System.out.println("Stopping Thread " + getName());

		}
	

}
