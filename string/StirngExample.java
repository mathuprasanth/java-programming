package com.fita.team2.string;

public class StirngExample {

	public static void main(String[] args) {
		char[] place= {'p','a','l','l','i','p','a','l','a','y','a','m'};
		String name=new String(place);
		System.out.println(name);
		
		String name1="loganathan";
		String name3= "mathu";
		String name6="mathu";
		
		String name2=new String("loganathan");
		String name4=new String("mathu").intern();
		System.out.println(name6.equals(name4));
		
	char[] ch= {'m','a','t','h','u'};
	String name5=new String(ch);
	System.out.println(name5);
	
		System.out.println(name1 .equals(name2));
		System.out.println(name3==name4);
		System.out.println(name3!=name1);
		if((name1==name2)||(name6==name3))
		{
			System.out.println(name3);
			
		}else
		{
			System.out.println(name1);
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[2]);
		}
	}

}
