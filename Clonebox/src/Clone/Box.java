package Clone;

public class Box implements Cloneable{
	private int length;
	private int breadth;
	
	public Box() {
		
	}

	public Box(int length, int breadth) {
	
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
	
	

}
