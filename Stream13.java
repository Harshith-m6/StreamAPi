package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class Stream13 {
	public static void main(String[] args) {
		String str = "Java is easy to Learn";
		List<String> wordList = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		Collections.reverse(wordList);
		str = wordList.stream().reduce("", (a,b)->a+b+" ");
		System.out.println(str);
		
		String str1 ="Java is easy to Learn";
		str1 = Arrays.stream(str1.split(" ")).reduce("", (a,b)->" "+b+a).trim();
		System.out.println(str1);
	}

}
