package com.fita.team2.string;


public class StringLength {

	public static void main(String[] args) {
		String word="hello i am mathuprasanth from erode";
		String []split=word.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++)
		{
			count++;
		}
		System.out.println("number of words in string");
		System.out.println(count);
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
				}
	}
	




