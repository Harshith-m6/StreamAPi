package com.rcb.StreamApi;
import java.util.*;
public class Stream12 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Suresh","Rakesh","Paramesh","Rudresh","Ramesh");
		List<Character> firstLetters = names.stream().map(n->n.charAt(0)).toList();
		System.out.println(firstLetters);
	}

}
