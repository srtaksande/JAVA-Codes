package custom;

public class TestCustom {

	public static void main(String[] args) {
		Transaction t =  new Transaction();
		t.balance = 10000;
		
		try {
			t.deposit(8999);
			t.print();
		}
		catch (NegativeAmountException e){
			e.printException();	
		}

	}

} 
