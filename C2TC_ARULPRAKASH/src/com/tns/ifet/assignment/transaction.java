package com.tns.ifet.assignment;

final public class transaction {
	final static int transaction_fee=2;
	final float get_transaction_fee(float amount) {
		return amount+(amount/100)*transaction_fee;
	}

}
