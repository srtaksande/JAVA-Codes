package simple;

public class PermanentEmployee extends Employee 
{
float basicSalary;
float hra;
float da;


public PermanentEmployee() {
	super();
}


public PermanentEmployee(float id, String name ,float basicSalary) {
	super(id,name);
	this.basicSalary = basicSalary;
}

public void CalculateSalary() {
	hra = basicSalary * 0.2f;
	da = basicSalary * 0.15f;
	salary = basicSalary + hra + da;
	
}
@Override
	public void print() {
		System.out.println("Permanent Employee:");
		super.print();
		System.out.println("BasicSalary=" +basicSalary);
		System.out.println("Hra=" +hra);
		System.out.println("Da=" +da);
	}


	
}


