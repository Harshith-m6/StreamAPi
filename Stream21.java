package com.rcb.StreamApi;

import java.util.Arrays;

public class Stream21 {
	public static void main(String[] args) {
		String st="Rama is working in infosys";
		
		String hword = Arrays.stream(st.split(" ")).sorted((x,y)->Integer.compare(y.length(), x.length())).findFirst().orElse("None");
		System.out.println(hword);
	}

}
