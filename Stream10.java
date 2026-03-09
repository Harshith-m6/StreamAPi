package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream10 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Rakesh","Suresh","Manjesh","Lokesh");
		int rcount = (int)names.stream().filter(name->name.startsWith("R")).count();
		System.out.println("names start with R "+rcount);
		
		List<String> rnames = names.stream().filter(n->n.charAt(0)=='R').toList();
		System.out.println(rnames);
		
		Set<String> uNames = names.stream().filter(n->n.startsWith("R")).collect(Collectors.toSet());
		System.out.println(uNames);
		
		String str = names.stream().filter(n->!n.startsWith("R")).reduce("", (a,b)->a+b+" ");
		System.out.println(str);
	}

}
