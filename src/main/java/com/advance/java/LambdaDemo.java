package com.advance.java;

public class LambdaDemo {

	public static void main(String[] args) {
//		InterfaceDemo gg=new Game();
//		gg.test();
//		gg.test2();
//		InterfaceDemo.test3();
		// Reference Id
		
		InterfaceDemo lambda = (int no1, int no2) -> System.out.println(no1 + no2);
		lambda.add(100,200);
	}
}
