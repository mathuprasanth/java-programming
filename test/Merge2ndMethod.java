package com.fita.team2.test;

import java.util.Arrays;

public class Merge2ndMethod {

	public static void main(String[] args) {
		int []a= {23,43,53,63,73};
		int []b= {33,45,22,11,97};
		
		int c=a.length;
		int d=b.length;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		
		
		System.out.println(Arrays.toString(a)+Arrays.toString(b));

	}

}
