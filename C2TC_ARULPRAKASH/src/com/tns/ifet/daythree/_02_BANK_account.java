package com.tns.ifet.daythree;
//1. Create a class that represents a bank account with private attributes for account number, 
//balance, and interest rate. Implement getter and setter methods for the balance attribute that 
//prevent negative values from being set.
class account{
	private long  account_number;
	private float amount=0;
	private float interest;
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public float getAmount() {
		return amount;
	}
	public String setAmount(float amount) {
		if(amount>=0) {
		this.amount = this.amount+amount;
		return "the amount is added correctly";}
		else {
			return "the amount should be positive";}
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	
	
}
public class _02_BANK_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account n1=new account();
		n1.setAccount_number(01);
		n1.setAmount(100);
		System.out.println(n1.getAmount());
		System.out.println(n1.setAmount(-1));	
	}

}
