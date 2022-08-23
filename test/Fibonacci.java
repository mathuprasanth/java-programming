package com.fita.team2.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=s.nextInt();
		System.out.println("enter num2");
		int num2=s.nextInt();
		int num3;
		int count=20;
		for(int i=0;i<count;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
		//	System.out.println("the fibonacci series is");
			System.out.println(num3);
		}
	}

}
