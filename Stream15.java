package com.rcb.StreamApi;
import java.util.*;
import java.util.stream.IntStream;
public class Stream15 {
	public static void main(String[] args) {
		boolean even =IntStream.rangeClosed(1, 10).anyMatch(n->n%2==0);
		System.out.println(even);
		
		boolean prodOf2 = IntStream.range(1, 21).anyMatch(n->n/2==0);
		System.out.println(prodOf2);
		
	}

}
