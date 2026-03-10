package com.rcb.StreamApi;
import java.util.*;
public class Stream11 {
	public static void main(String[] args) {
		//convert all the characters to upperCase
		List<String> names = Arrays.asList("Ramesh","Suresh","Rakesh","Paramesh","Rudresh","Ramesh");
		List<String> upperCase = names.stream().map(s->s.toUpperCase()).toList();
		System.out.println(upperCase);
		//map() takes Function<> as the argument and used apply method R r apply(T t)
		
		//find the length of each string element in the List
		List<Integer> nameLength = names.stream().map(n->n.length()).toList();
		System.out.println(nameLength);
		
		//distinct only gives the unique values/elements from the stream
		List<Integer> distLen = names.stream().map(n->n.length()).distinct().toList();
		System.out.println(distLen);
		
		//Stream will not keep the data , we should use separate container to store the values (List) to collect the we use terminal functions .toList() .collect etc 
		
		
		
	}

}
