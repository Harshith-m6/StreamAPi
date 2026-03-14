package com.rcb.StreamApi;
import java.util.*;
import java.util.Arrays;

public class Stream22 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		values.stream().forEach(x->System.out.println(x+"->"+Thread.currentThread().getName()));
		
		values.parallelStream().forEach(x->System.out.println(x+"->"+Thread.currentThread().getName()));
	}

}
