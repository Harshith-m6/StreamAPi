package com.rcb.StreamApi;
import java.util.*;
import java.util.stream.Collectors;
public class Stream23 {
	public static void main(String[] args) {
		String str = "java is a more powerful language and java is easy";
//		Map<String,Integer> fword = new HashMap<String,Integer>();
//		String[] word = str.split(" ");
//		for(String words : word)
//		{
//			if(fword.containsKey(words))
//				fword.put(words, fword.get(words)+1);
//			else
//				fword.put(words, 1);
//		}
//		System.out.println(fword);
		Map<String , Long> fword = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(word->word,Collectors.counting()));
		
		System.out.println(fword);
		
		
	}

}
