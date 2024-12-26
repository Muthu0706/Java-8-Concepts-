package com.advance.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamDemo {
	public static void main(String args[]) {
		int[] ar = {10,5,7,3,6};
		
//		IntStream arr =Arrays.stream(ar);
//		System.out.println(arr);
		Arrays.stream(ar) // Intermediate Operation
		.sorted(). // Intermediate Operation
		forEach(System.out::println); // Terminal Operation 
		// Why for Used Stream  : It is main Performance Process reverse direction Running.
	    // n Number of Intermediate Operator given Inside method.

		
		
		// Average :
		int[] average = {5,7,2,5,5};
		System.out.println(
		Arrays.stream(average).average());
		
		
		// Optional Interface Java.util.package 
		// A container object which may or may not contain non-null value.
		// If a value is present,is Present() will return true and get() will return the value.
		
		// It is check null value .NullpointException 
		
		// Example  Username ,password .It is have go to check database 
		int[] averageOpioanl = {5,7,2,5,5};
		OptionalDouble od = Arrays.stream(averageOpioanl).average();
        System.out.println(od.getAsDouble());
         
         // Max & Min:
         int[] arMax = {10,5,7,3,10};
         OptionalInt odMax = Arrays.stream(arMax).max(); // min given
         System.out.println("get Maxvalue" + odMax.getAsInt());
         
         //FindFrist
         int[] arFirst = {10,5,7,3,10};
         OptionalInt odFirst = Arrays.stream(arFirst).findFirst(); // min given
         System.out.println("Find first number--" + + odFirst.getAsInt());
  
         // Count 
         int[] arCount = {10,5,7,3,10};
         long odCount=Arrays.stream(arCount).count();
         System.out.println(odCount);
         
         
         // Unique elements find
         int[] arUnique = {10,5,7,3,10};
         Arrays.stream(arUnique).distinct()
//         .forEach(elem - >System.out.println(elem));
          .forEach(System.out::println);
         
         
         // Filter 
         int[] arFilter = {10,5,7,3,10,12,8,2,4,6};
         Arrays.stream(arFilter).filter(no -> no%4==0) // Predicate concept Here is it.
         .forEach(System.out::println);
         
         
         // -------CollectionsObject.stream--------------
         
         List<String> number=new ArrayList<String>();
         number.add("abc");
         number.add("bcde");
         number.add("efghdf");
         number.add("wxyz");
         number.add("cdfe");
         number.stream(). // stream
         distinct(). // 10,30,20,50
         sorted((elem1 ,elem2) -> elem1.length()). // 10,20,30,40  // comparator it is 
         forEach(System.out::println);
	}

}
