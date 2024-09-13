package thread;

public class threadB extends Thread{

	@Override
	public void run() {
		System.out.println("starting Thread...");
		for (int i=1; i <=60; i++) {
			System.out.println("Thread B =" +i);
		}
		
		System.out.println("Stopping Thread B...........");

		}
	

}
