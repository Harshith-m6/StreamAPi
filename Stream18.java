package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Stream18 {
	public static void main(String[] args) {
		int[] arr = {12,23,34,54,72,79,17,68,93};
		IntPredicate isPrime= n -> IntStream.range(2, (int)Math.sqrt(n)).noneMatch(i->n%i==0);
		System.out.println("First Prime "+Arrays.stream(arr).filter(isPrime).findFirst().orElse(-1));
		
		
		System.out.println("Last Prime"+Arrays.stream(arr).filter(isPrime).reduce((a,b)->b ).orElse(-1));
		
		System.out.println("All prime numbers: "+Arrays.stream(arr).filter(isPrime).boxed().toList());
		
		
		
	}

}
