package com.fita.team2.Operators;

public class Unary {
	public static void main(String args[])
	{
		System.out.println("UNARY VALUE");
	int x=10;
	int y=12;
	int a=200;
	float b=-120f;
	int z=100;
	System.out.println("PREFIX VALUE");
	System.out.println(x--);
	System.out.println(--x);
	System.out.println("POSTFIX");
	System.out.println(y++);
	System.out.println(++y);
	System.out.println("negation of a");
	System.out.println(~a);
	System.out.println("condition");
	if(a<500)
	{
		System.out.println("true");
	}
	else
		{
			System.out.println("false");
		}
	System.out.println("second condition");
	
	if(b==-120)
	{
		System.out.println("true");
		}
	else
	{
		System.out.println("false");
	}
	System.out.println("third condition");
	
	if(z!=100)
	{
		System.out.println("true");
	}
		else
		{
			System.out.println("false");
		}
	}
}
