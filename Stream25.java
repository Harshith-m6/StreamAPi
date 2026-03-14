package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream25 {
	public static void main(String[] args) {
		int[] ar= {2,3,4,5,4,3,2,6,7,5,3};
		Map<Integer,Long> frq = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(frq);
		
		Map<String,Long> freq = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(x->x%2==0?"Even":"Odd",Collectors.counting()));
		
		System.out.println(freq);
		
		Map<String,List<Integer>> fr1 = Arrays.stream(ar).boxed().collect(Collectors);
	}

}
