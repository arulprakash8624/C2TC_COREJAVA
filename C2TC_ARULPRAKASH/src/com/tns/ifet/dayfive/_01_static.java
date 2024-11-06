package com.tns.ifet.dayfive;

class static_block{
	static int a=10;
	static final int b=20;
	final int c=90;
	static_block(){
		a=a+24;
		System.out.println("the constructor is called A:"+a);
		System.out.println("the constructor is called  B"+b);
		
	}
	static {
		a=a+24;
		System.out.println("the static block is called A:"+a);
		System.out.println("the static block is called  B:"+b);

	}
	void display_1() {
		System.out.println("the display_1 is called A:"+a);
		System.out.println("the display_1 is called B:"+b);
		System.out.println("the display_1 is called C:"+c);
		
	}
	static void display() {
		System.out.println("the display is called A:"+a);
		System.out.println("the display is called B:"+b);

	}
	final void final_methos() {
		System.out.println("the final method is called");
	}
	
}
final class final_block extends static_block{
	final_block(){
		System.out.println("final block is excuted");
	}
//	void final_methos() {    cannot override the final methods
//		
//	}
}


public class _01_static {
	public static void main(String [] agrs) {
		System.out.println("program starts");
		static_block obj;
		System.out.println("the class is start");
		obj=new static_block();
		static_block.display();
		obj.display_1();
		System.out.println("_____________________");
		static_block obj1=new static_block();
		static_block.display();	
		obj1.display_1();
		final_block fiobj = new final_block();
		
		
		
	}

}
