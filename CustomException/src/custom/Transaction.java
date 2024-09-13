package custom;

public class Transaction {
	float balance;
	int minbal = 1000;
	
	void deposit(float amount) throws NegativeAmountException {
		if (amount > balance || (balance - amount) <= minbal)
			throw new NegativeAmountException();
		else
			balance -= amount;
	}
	
	void print()
	{
		System.out.println("Balance =" + balance);
	}
}
