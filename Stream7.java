package com.rcb.StreamApi;
import java.util.*;
import java.util.stream.Stream;
public class Stream7 {
	public static void main(String[] args) {
		List<String> subs = Arrays.asList("Java","Python","C++");
		
		Stream<String> str1 = subs.stream();
		Stream<String> str2 = subs.stream();
		str1.forEach(x->System.out.println(x));
		str2.forEach(System.out::println);
		
		Integer[] values = {1,2,3,4,5,6};
		Arrays.stream(values).forEach(x->System.out.print(x+" "));
		
		 Stream.of(10,20,30,40,50).forEach(System.out::println);
		
	}
}
