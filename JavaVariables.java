package com.fita.team2new;

public class JavaVariables {
	public static void main(String[] args) {
	{
	int a=678;// instance variable//
	int b=543;
	int c=a+b;
	System.out.println("instanse variable=:"+c);
	JavaVariables lv=new JavaVariables();
	lv.sum();
	}
	}
	static int z=1000;//static variable//
public void sum()
{
	int x=89;
	int y=76;
	int c=x*y;//local variable//
	System.out.println("local variables=:"+c);
	System.out.println("static variable=:"+z);
}
}
