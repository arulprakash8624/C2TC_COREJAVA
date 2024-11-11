package com.tns.ifet.daythree;

import java.util.Scanner;

class Student1 {
	int rollnumber;
	String name;

	Student1(int roll, String name) {
		this.rollnumber = roll;
		this.name = name;
	}

	void get_value() {
		System.out.println("the value are:");
		System.out.println(name);
		System.out.println(rollnumber);
	}
}  
public class _03_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the number of student:");
		int n = sc.nextInt();
		Student1[] s = new Student1[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the rollnumber and name:");
			int roll = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();

			s[i] = new Student1(roll, name);
		}
		for (int i = 0; i < n; i++) {
			s[i].get_value();
		}
		sc.close();
	}

}
