package com.tns.ifet.assignment;

public class person {
	private String name;
	private String phone;
	private String account_number;
	private accounts acc;
	person(String name,String phone,String account_number,accounts acc){
		this.name=name;
		this.phone=phone;
		this.account_number=account_number;
		this.acc=acc;
	}
	public String toString() {
		return "person [name=" + name + ", phone=" + phone + ", account_number=" + account_number+ "]";
	}
}
