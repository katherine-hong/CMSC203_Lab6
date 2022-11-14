
public class SavingsAccount extends BankAccount {
	
	// The following are the attributes
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	// The following are the constructor(s)
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		
		//String accNum = super.getAccountNumber() + "-" + savingsNumber;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;

		
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
    {
          super(oldAccount, amount);
          
          this.savingsNumber = oldAccount.savingsNumber + 1;
          this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
          //savingsNumber++;
//          String accountID = "-"+savingsNumber;
//          String accountNumber = super.getAccountNumber();
//          accountNumber = accountNumber + accountID; 
                       
    }
	
	// The following are the methods
	
	public void postInterest()
	{
		double balanceAmt = (getBalance() * rate) / 12;
		//super.setBalance(balanceAmt + getBalance());
		deposit(balanceAmt);
	}
	
	@Override
	public String getAccountNumber()
    {
          return this.accountNumber;
    }
	

}
