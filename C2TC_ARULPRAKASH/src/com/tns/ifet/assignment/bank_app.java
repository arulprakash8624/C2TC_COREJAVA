package com.tns.ifet.assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class bank_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("create a account if yes press 1:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("enter the name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("enter the phone number:");
			String phone=sc.nextLine();
			int account_choice=0;
			while(account_choice!=1 || account_choice!=2) {
			System.out.println("enter the choice of the account \n 1.saving account \n 2.checking account");
			account_choice=sc.nextInt();
			if(account_choice==1 || account_choice==2)
			{
				break;
			}
			else {
				System.out.println("enter the correct choice:");
			}
			}
			bank obj=new bank(name,phone,account_choice);
			System.out.println("account created successfullly !!");
			bank.get_account_details();
		}
		System.out.println(bank.getTotal_number_of_accounnts());
		
		sc.close();
	}

}
