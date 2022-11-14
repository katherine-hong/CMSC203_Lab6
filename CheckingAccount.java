
public class CheckingAccount extends BankAccount {
	
	static final double FEE = 0.15;
	
	// The following are the constructor(s)
	
	public CheckingAccount(String name, double amount)
	{	
		super(name, amount);
		
		String accNum = getAccountNumber() + "-10";
		super.setAccountNumber(accNum);
	}
	
	// The following are the methods
	
	@Override
	public boolean withdraw(double amount)
	{
		double amt = amount + FEE;
		
		return super.withdraw(amt);
	}

}
