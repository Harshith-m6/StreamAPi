package com.rcb.StreamApi;
import java.util.*;
public class Stream17 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(23,45,78,65,27,39);
	    System.out.println(values.stream().anyMatch(x->x%3==0)?"Present":"Not Present");
	    
	    Optional<Integer> num =values.stream().filter(x->x%2==0).findAny();
	    
	    System.out.println(num.isPresent()?num.get():"Not Present");
	    //optional is used when we use findAny or findAll which returns the optional
	    Optional<Integer> number = values.stream().filter(x->x%9==0).findAny();
	    System.out.println(number.isPresent()?number.get():"Not present");
	    
	    values.stream().filter(n->n%9==0).findAny().ifPresentOrElse(System.out::println,()-> System.out.print("Not present"));
	}

}
