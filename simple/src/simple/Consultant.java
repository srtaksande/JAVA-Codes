package simple;

public class Consultant extends Employee{
	float hours;
	float perhourRate;
	
	
	public Consultant() {
		super();
		
	}
	public Consultant(float id, String name , float hours, float perhourRate) {
		super(id, name);
		this.hours = hours;
		this.perhourRate = perhourRate;
	
	}
	
	
	public void CalculateSalary() {
		salary = hours * perhourRate;
		
		
	}
	public void print() {
		System.out.println("\n\nConsultant:");
		super.print();
		
		System.out.println("Hours=" +hours);
		System.out.println("PerHourRate=" +perhourRate);
	}
	

}

