package com.fita.team2.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		System.out.println("print duplicate value");
		int []dup= {23,65,54,7,23,11,78,91,7};
		
		for(int i=0;i<dup.length;i++)
		{
	for(int j=i+1;j<dup.length;j++)
	{
		if(dup[i]==dup[j])
		System.out.println(dup[j]);
		}
	}
	}
}


