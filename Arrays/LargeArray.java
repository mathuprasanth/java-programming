package com.fita.team2.Arrays;

import java.util.Arrays;

public class LargeArray {

	public static void main(String[] args) {
		System.out.println("PRINT LARGE AND SMALL VALUE");
		int [] c= {123,654,305,543,34,224,987};
		int max=c[0];
		int small=c[0];
		for(int i=0;i<c.length;i++)
		{
		if(c[i]>max)
		max=c[i];
		}
		System.out.println("largest number is:"+max);
		
		for(int i=0;i<c.length;i++)
		{
		if(c[i]<small)
		small=c[i];
		}
		System.out.println("smallest number is:"+small);
}
	}