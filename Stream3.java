package com.rcb.StreamApi;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream3 {
	
	static boolean isPrime(int n)
	{
		
		return n>1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i->n%i==0);
	}
	
	public static void main(String[] args) {
		//Check whether the number is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(isPrime(n))
		{
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
		
		System.out.println("Printing the prime numbers within 100");
		IntStream.range(1, 100).filter(x->isPrime(x)).forEach(System.out::println);
		System.out.println("---------------------");
		
		System.out.println("printing the count of prime numbers ");
		long count = IntStream.range(1, 100).filter(x->isPrime(x)).count();
		System.out.println("Number of prime numbers present bw 1 to 100 is "+count);
		List<Integer> primeNumbers = IntStream.range(1, 100).filter(x->isPrime(x)).boxed().collect(Collectors.toList());
		System.out.println(primeNumbers);
		
	}

}
