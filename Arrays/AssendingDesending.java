package com.fita.team2.Arrays;

import java.util.Arrays;

public class AssendingDesending {
public static void main(String[] args) {
		int [] array= {34,12,1,65,1,8,121,24,4};
		System.out.println(" original array value:");
		 Arrays.sort(array);
		 for(int i=0;i<array.length;i++)
		 {
	System.out.println(array[i]);
		 }
		 System.out.println(" sort array value");
		 for(int i=array.length-1;i>=0;i--) 
		 {
			 System.out.println(array[i]);
		 } 
}

}