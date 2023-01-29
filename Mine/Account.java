import java.lang.*;

public class Account
{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(){}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setAccountHolderName(String AccountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	public void despositMoney(double amount){}
	public void withdrawMoney(double amount){}
	
	
}