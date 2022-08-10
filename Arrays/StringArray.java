package com.fita.team2.Arrays;

public class StringArray {

	public static void main(String[] args) {
		System.out.println("array names:");
	   String [] names=new String[6];
	   names[0]="mathu";
	   names[1]="logu";
	   names[2]="dheena";
	   names[3]="kamal";
	   names[4]="boopathi";
	   names[5]="prasanth";
	   for(int i=0;i<names.length;i++)
	   {
	   System.out.println(names[i]);
	   }
	   System.out.print("selected array:");
	System.out.println(names[5]);
	System.out.println("concodination of two array:");
	System.out.println(names[0] + names[5]);
	
	
	
}
}
