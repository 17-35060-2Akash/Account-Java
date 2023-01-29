import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	public SavingsAccount()
	{
		System.out.println("E-Savings Account");
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate(){return interestRate;}
}