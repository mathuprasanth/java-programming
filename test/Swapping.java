package com.fita.team2.test;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	Scanner mathu=new Scanner(System.in);
	System.out.println("enter the first name");
	String name1=mathu.nextLine();
	System.out.println("enter the second name");
	String name2=mathu.nextLine();
	System.out.println("before Swapping");
	System.out.println("name 1="+name1);
	System.out.println("name 2="+name2);
	String name3=name1+name2;
	
	System.out.println("after swapping");
		System.out.println("name 1="+name3.substring(5,13));
		System.out.println("name 2="+name3.substring(0,5));
		
	}
	
	}

	




