package com.tns.ifet.dayone;

import java.util.Scanner;

public class sample_01 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer:");
		int a=sc.nextInt();
		  System.out.println("value of the number variable is : "+a); 
		  System.out.println("enter your name:");
		  sc.nextLine();
		  String studentName=sc.nextLine();
		  System.out.println("value is : "+studentName);
		  sc.close();
		
	}
}
