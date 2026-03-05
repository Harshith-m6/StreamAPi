package com.rcb.StreamApi;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream4 {
	
	static boolean isPerfect(int n)
	{
		return n==IntStream.rangeClosed(1, n/2).filter(i->n%i==0).sum();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(n+" is a perfect number");
		
		IntStream.range(1, 1000).filter(Stream4::isPerfect).forEach(System.out::println);
		
		List<Integer> perfectNumber = IntStream.range(1, 1000).filter(i->isPerfect(i)).boxed().toList();
		
		System.out.println(perfectNumber);
		
		long count = IntStream.range(1, 1000).filter(i->isPerfect(i)).count();
		System.out.println(count);
	}

}
