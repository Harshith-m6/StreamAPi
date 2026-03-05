package com.rcb.StreamApi;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Stream2 {
	public static void main(String[] args) {
		IntPredicate ip = (i)-> i%2==0; 
		System.out.println("printing even digits");
		IntStream.range(0, 10).filter(ip).forEach(System.out::println);
		System.out.println("------------------------");
		long ocount =IntStream.range(0, 10).filter(x->x%2!=0).count();
		System.out.println("number of odd digits"+ocount);
		System.out.println("------------------------");
		System.out.println("Printing the two digits palindrome");
		IntStream.range(10, 100).filter(n->n%11==0).forEach(System.out::println);
		
	}

}
