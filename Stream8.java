package com.rcb.StreamApi;

import java.util.stream.Stream;

public class Stream8 {
	//generating the infinite stream
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.iterate(1, x->x+2).limit(10);
		stream1.forEach(System.out::println);
		
		Stream<Integer> stream2 = Stream.iterate(1, x->x+5).limit(5);
		stream2.forEach(System.out::println);
		
		Stream.iterate(2, x->x*2).limit(5).forEach(System.out::println);
	}

}
