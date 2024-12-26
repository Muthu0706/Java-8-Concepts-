package com.advance.java;


public class Game implements InterfaceDemo{

	
	public static void main(String[] args) {
//         Game gg =new Game();
		InterfaceDemo gg=new Game(); // Reference data 
		// Dynamic Binding 
		gg.add(24,35);  // abstract method
		gg.test2(); // default method
		InterfaceDemo.test3(); // static method 
		
	}
	
	
	@Override
	public void test() {
		System.out.println("Game Test");
	}
	
}
