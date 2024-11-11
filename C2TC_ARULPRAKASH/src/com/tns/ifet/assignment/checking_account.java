package com.tns.ifet.assignment;

public class checking_account extends accounts {

	@Override
	public void deposit(float amount) {
		
		super.amount=super.amount+amount;	 
		
	}

	@Override
	public void withdraw(float amount) {
	
		super.amount=super.amount-amount;	 
		
	}

	@Override
	public float getbalance() {
	
		return super.amount;
		
	}

	

}
