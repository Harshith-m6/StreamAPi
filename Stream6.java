package com.rcb.StreamApi;
import java.util.*;
import java.util.stream.Stream;
public class Stream6 {
	public static void main(String[] args) {
		//creating stream using .stream()
		List<String> sub = Arrays.asList("c","c++","java","python");
		Stream<String> stream1 = sub.stream();
		//creating stream using Arrays.stream(arr)
		Integer[] values = {23,45,67,43};	
		Stream<Integer> stream2 = Arrays.stream(values);
		//creating stream using Stream.of(x,y,z)
		Stream<Integer> stream3 = Stream.of(23,45,67,65,43);
		//creating infinite stream using Stream.iterare(x,y)
		Stream<Integer> stream4 = Stream.iterate(1, n->n+2);
	}

}
