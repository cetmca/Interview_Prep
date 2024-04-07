
class MainClass
{
	public static void main(String Str[])
	{
	System.out.println("hello");
	
	BankAccount bankacct = new BankAccount(100);
	bankacct.deposit(20);
	bankacct.withdraw(10);
	
	}

}

  class BankAccount  {
	private double balance;
	
	public BankAccount(double initialBalance)
	{
		this.balance= initialBalance;
	}
	
	public void deposit(double amount)
	{
		this.balance +=amount;
	}
	
	public void withdraw(double amount)
	{
		if(this.balance >amount)
		{
			this.balance -=amount;
			System.out.println("withdraw complete");
		}
		else
		{
			System.out.println("Exception");
		}
	}
	
	public double getBalance()
	{
		return this.balance;
	}

}
