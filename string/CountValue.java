package com.fita.team2.string;

import java.util.Scanner;

public class CountValue {

	public static void main(String[] args) {
		Scanner mp=new Scanner(System.in);
		System.out.println("enter the String");
		String name=mp.nextLine();
		char[]name2=name.toCharArray();
		for(int i=0;i<name2.length;i++)
		{
			int count=0;
			for(int j=0;j<name2.length;j++)
				{
				
				
				if(name2[i]==name2[j])
				{
				count++;
				}
					
		}
			System.out.println(" the count of " + name2[i] + " is= " + count);
	}
	}
}
		
		
		
			
				
		
		
		
		
	
		
			   
		
	
	


		
		
		
	
	

	

	
	
		
	
			
			
	
		

	
	
	
