package com.tns.ifet.daythree;

import java.util.Scanner;

class Area {
	int length;
	int breath;

	void set_Dim(int length, int breath) {
		this.length = length;
		this.breath = breath;
		System.out.println("the set_Dim is called!");
	}

	int get_area() {
		System.out.println("the get_area is called!");
		return length * breath;
	}
}

public class _01_area_rectangle {
	public static void main(String[] agrs) {
		System.out.println("enter the length and breath of rectangle:");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breath = sc.nextInt();
		Area obj = new Area();
		obj.set_Dim(length, breath);
		System.out.println(obj.get_area());
		sc.close();
	}
}
