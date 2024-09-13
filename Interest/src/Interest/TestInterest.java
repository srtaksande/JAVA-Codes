package Interest;

public class TestInterest {

	public static void main(String[] args) {
		CompoundInterest e1 = new CompoundInterest();
		e1.P = 10;
		e1.T = 2;
		e1.R = 7;
		
		e1.C = (e1.P *Math.pow(1 + (e1.R / 100), e1.T)) - e1.P;
		e1.Interest();

	}

}
