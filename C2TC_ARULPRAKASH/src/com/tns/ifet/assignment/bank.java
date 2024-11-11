package com.tns.ifet.assignment;

import java.util.ArrayList;

public  class bank {
	static int total_number_of_accounnts=0;
	static ArrayList<person> arr= new ArrayList<person>();
	public static long getTotal_number_of_accounnts() {
		return total_number_of_accounnts;
	}
	public bank(String name, String phone,int account_choice) {
		bank.total_number_of_accounnts++;
		String account_number;
		accounts acc;
		if(account_choice==1) {
			account_number="SAC"+"bob"+"123"+Integer.toString(bank.total_number_of_accounnts);
			acc=new savings_account();
		}
		else {
		 account_number="CAC"+"bob"+"123"+Integer.toString(bank.total_number_of_accounnts);
		 acc=new checking_account();
		}
		person obj=new person(name,phone,account_number,acc);
		arr.add(obj);
	}
	static void get_account_details() {
		for(person p:arr) {
			System.out.println(p.toString());
		}
		
	}
}
