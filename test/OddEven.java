package com.fita.team2.test;

public class OddEven {

	public static void main(String[] args) {
		int[]num= {2,3,6,8,7,5,10,12,9};
		int odd=0;
		int even=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				odd++;
				
			}else
			{
				even++;
			}
		}
		System.out.println("odd num is="+odd);
		System.out.println("even num is="+even);

	}

}
