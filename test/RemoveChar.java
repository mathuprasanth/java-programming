package com.fita.team2.test;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner pm=new Scanner(System.in);
		System.out.println("enter the name");
String name=pm.nextLine();
char name1=pm.nextLine().toCharArray()[2];
int b=name1;
System.out.println(name1);
System.out.println(name.replace("m", ""));

	}

}
