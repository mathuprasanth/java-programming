package com.fita.team2.test;

import javax.naming.Name;

public class OddNumEvenNum {

	public static void main(String[] args) {
		int []num= {2,4,6,3,1,7,8,9,10,11};
		System.out.println("even num is");
		for(int i=0;i<num.length;i++)
			
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}
		System.out.println("odd num is");
			for(int j=0;j<num.length;j++)
			{
				if(num[j]%2!=0)
				{
					System.out.println(num[j]);
				}
			}
			}
		
	}

