package com.rcb.StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream5 {
	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(1, 10).map(i->i*2).boxed().toList();
		List<Integer> list2 = IntStream.rangeClosed(1, 10).map(i->i+i).boxed().collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list);
	}

}
