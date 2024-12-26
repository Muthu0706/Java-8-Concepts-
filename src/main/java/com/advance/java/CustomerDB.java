package com.advance.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDB {

	
	public static List<Customer> getAll(){
		List<Customer>  customerList = new ArrayList<>();
		customerList.add(new Customer(1 , "Muthu", "muthurajp632@gmail.com" , Arrays.asList("3424566342" , "34235666")));
		customerList.add(new Customer(2 , "Abinaya", "abinayap632@gmail.com" , Arrays.asList("34252466723" , "754365345")));
		customerList.add(new Customer(1 , "Pravin", "prain632@gmail.com" , Arrays.asList("676437745" , "7678834564")));
		customerList.add(new Customer(1 , "Gayatheri", "gayatheri632@gmail.com" , Arrays.asList("3424566342" , "34235666")));
	    return customerList;
	}
}
