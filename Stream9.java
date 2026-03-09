package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Stream9 {
	//Stream Pipeline - How the data flow when we performing the stream operation
	// step1 - stream object- converting data into stream object  from the source (Collection , Array , of )
	// step2 - intermediate operations (filter(),map(),sorted(),distinct(),skip(),limit())
	//step3 - terminal operation (forEach(), count , max() , min() , anyMatch() , allMatch() , noneMatch() , findfirst() , reduce() , count())
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(3,10,25,13,8,2,10,12,30,10);
		values.stream().filter(x->x>10).map(x->x*2).distinct().forEach(System.out::println);
	}

}
