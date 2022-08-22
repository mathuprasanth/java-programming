package com.fita.team2.string;

public class StringMethod {

	public static void main(String[] args)
	{
		String area = "erode,chennai,madurai";
		String name="mathu prasanth";
		String dpmt="COMPUTER SCIENCE";
		
		System.out.println(name.equals(name));// check value
		System.out.println(name.length());//String length
		System.out.println(name.charAt(4));//specific char
		System.out.println(name.compareTo("mathu"));//compare value
		System.out.println(name.toLowerCase());
		System.out.println(area.toUpperCase());
		System.out.println(name.trim());//remove space
		System.out.println(dpmt.substring(3,10));// specific intex number print
		System.out.println(name.isEmpty());//string is empty
		System.out.println(name.concat(dpmt));//concodinate
		String[]split=area.split(",");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		if(dpmt.contains("SCIENCE"))
				{
			System.out.println(name);
		}
		else
		{
			System.out.println(("other department student"));
		}

	}

}
