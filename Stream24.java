package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream24 {
	public static void main(String[] args) {
		String str = "Programming";
		Map<Character, Long> frq = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(frq);
	}

}
