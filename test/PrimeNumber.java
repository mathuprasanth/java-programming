package com.fita.team2.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("enter the number");
		int num=m.nextInt();
		boolean prime=true;
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
			++i;
		}
		if(prime)
		{
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime number");
		}
	}
}	

