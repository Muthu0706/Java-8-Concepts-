package com.advance.java;


@FunctionalInterface      // should have One Abstract Method ,n of default method 
public interface InterfaceDemo {

	// Functional Interface :
   public abstract void add(int no1, int no2) ; // single abstract method have
	   
   default void test2() {	
		System.out.println("Hi I default method");
	}
   
	static void test3() {
		System.out.println("Hi I'm static method");
	}
		
}

