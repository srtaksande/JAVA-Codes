package Casio;

public class Calculator {
	private double a,b;
	double result;

 
	
	// default constructer
	public Calculator(){
		
	}
	public Calculator(double a,double b,double result) {
		this.a = a;
		this.b =b;
		this.result = result;
	}
	
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	void Add(){
		result = a+b;
		print();
	
	}
	void Sub() {
		
		result = a-b;
		print();
	}
	void Mul() {
		result = a*b;
		print();
	}
	void Div() {
		result = a/b;
		print();
	}
	
	void print() {
		System.out.println("a= " +a);
		System.out.println("b=" +b);
		System.out.println("result=" +result);
		
		
	}
}
