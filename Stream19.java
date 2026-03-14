package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream19 {
	public static void main(String[] args) {
		String str = "Rama is a good boy";
		String result=Arrays.stream(str.split(" ")).map(word-> new StringBuilder(word).reverse().toString())
		.collect(Collectors.joining(" "));
		System.out.println(result);
	}

}
