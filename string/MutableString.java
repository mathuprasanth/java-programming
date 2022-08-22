package com.fita.team2.string;

public class MutableString {

	public static void main(String[] args) {
			StringBuffer bf=new StringBuffer("mathu");
			System.out.println(bf);
			bf.append(10);
			System.out.println(bf);
			
			StringBuilder sbr=new StringBuilder("mathu");
			System.out.println(sbr);
			bf.append("prasanth");
	}

}
