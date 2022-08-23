package com.fita.team2.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int []num1= {2,34,12,67,23};
		int []num2= {4,68,24,134,46};
		int a1=num1.length;
		int a2=num2.length;
		int[]c=new int[a1+a2];
		System.arraycopy(num1,0,c,0,a1);
		System.arraycopy(num2, 0, c, a1, a2);
		System.out.println(Arrays.toString(c));
		
			
		
		


}
}



	

		

	

