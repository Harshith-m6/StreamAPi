package com.rcb.StreamApi;

import java.util.Arrays;

public class Stream20 {
	
	public static void main(String[] args) {
		String str = "Rama is eating food";
		String high = Arrays.stream(str.split(" ")).sorted((a,b)->-(a.length()-b.length())).toList().get(0);
		System.out.println(high);
	}

}
