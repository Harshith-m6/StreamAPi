package com.rcb.StreamApi;

import java.util.stream.IntStream;

public class Stream1 {
	
	public static void main(String[] args) {
		IntStream.range(0,10).forEach(System.out::println);
		//it generates the Integer stream
		//first bound is inclusive and end is exclusive
		//forEach is a terminal function used to print the elements in the Stream
		IntStream.rangeClosed(0, 15).forEach(System.out::println);
		//end value is inclusive
		System.out.println("----------------------------");
		//sum() is present is IntStream interface
		int sum = IntStream.rangeClosed(1, 5).sum();
		System.out.println(sum+" sum of 5 natural numbers");
		System.out.println("----------------------------");
		double avg = IntStream.rangeClosed(1, 5).average().getAsDouble();
		System.out.println("Average of first 5 natural number is "+avg);
		
	}

}
