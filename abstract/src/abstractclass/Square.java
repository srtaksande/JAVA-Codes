package abstractclass;

public class Square extends shape {
	
	float side;
	float radius;
	
	@Override
	void findarea() {
		area = side * side;
	}
	
	
	void print()
	{
		System.out.println("side=" +side);
		super.print();
	}
}
