package com.fita.team2.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

	public static void main(String[] args) {
		Scanner mathu=new Scanner(System.in);
		System.out.println("enter the names");
		String name1=mathu.nextLine();
		String name2=mathu.nextLine();
		
		Arrays.sort(name1.toCharArray());
		
		Arrays.sort(name2.toCharArray());
		
	if(name1.length()==name2.length())
	{
		System.out.println("anagram");
	}else
	{
		System.out.println("not anagram");
	}
		
		
		

}
	}
