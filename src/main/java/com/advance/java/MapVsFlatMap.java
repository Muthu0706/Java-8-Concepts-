package com.advance.java;

import java.util.List;
import java.util.stream.Collector;

public class MapVsFlatMap {
	public static void main(String args[]) {
	
		List<Customer> customerList = CustomerDB.getAll();
		
//List<Customer> convert List<String> -> Data Transformation
		
		List<String> emails = customerList.stream().map(Customer -> customerList.getEmail()).collect(Collector.toList());
	}
}
