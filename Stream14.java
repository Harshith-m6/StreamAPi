package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Stream14 {
	public static void main(String[] args) {
		List<Student> stu = Arrays.asList(new Student("harshith",1,100.00),new Student("abhi",3,98.00),new Student("pavan",2,99.00));
		
		List<String> nper = stu.stream().sorted((s1,s2)->Double.compare(s1.getPercentage(), s2.getPercentage())).map(s->s.getName()+" "+s.getPercentage()).toList();
		
		nper.forEach(System.out::println);
	}

}
