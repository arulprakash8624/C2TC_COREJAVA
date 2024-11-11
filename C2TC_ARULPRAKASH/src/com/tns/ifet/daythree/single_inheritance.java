package com.tns.ifet.daythree;
class class_one{
	class_one(){
		System.out.println("the constructor of class one is excuted");
	}
	void display() {
		System.out.println("the display in side the class one");
	}
}
class class_two extends class_one{
	class_two(){
		System.out.println("the contructor of class two is excuted");
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_one obj=new class_one();
		obj.display();
		class_two obj1=new class_two();
		obj1.display();
		

	}

}
