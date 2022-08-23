package com.fita.team2.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner mp=new Scanner(System.in);
	System.out.println("enter the name");
			String name1=mp.nextLine();
			for(int i=name1.length()-1;i>=0;i--)
				
			System.out.print(name1.charAt(i));
			
	}

	}

