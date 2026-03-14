package com.rcb.StreamApi;
import java.util.*;
public class Stream16 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Ramesh","Suresh","Sambram","Rakesh","Satish","Lokesh");
		String word = words.stream().filter(n->n.charAt(0)=='S').sorted().toList().getFirst();
		System.out.println(word);
		
		Optional<String> word1 = words.stream().filter(s->s.startsWith("Y")).sorted().findFirst();
		String  wo = word1.isPresent()?word1.get():"Not present";
		System.out.println(wo);
	}

}
