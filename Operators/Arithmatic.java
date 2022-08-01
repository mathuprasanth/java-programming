package com.fita.team2.Operators;

public class Arithmatic {

	public static void main(String[] args) {
		System.out.println("TEAM INDIA SCOREBOARD");
		
		int viratkohliscore=58;
		int rohitsharmascore=66;
		int suryakumarscore=43;
		int rishabpantscore=33;
		int extras =5;
		int bice=1;
		float jaspritbumbraovers=4;
		float bumbragiveruns=34;
		float chahalovers=3;
		float chahalgiveruns=41;
		float ravindrajadejaovers=2;
		float jadejagiveruns=23;
		float totalover=9;
		int totalsixes=4;
		int totalfours=7;
		int wicket=2;
		System.out.println("OPENING PARTNERSHIP:");
		
		System.out.println("VIRAT & ROHIT");
		System.out.println(viratkohliscore+rohitsharmascore);
		
		System.out.println("SECOND WICKET PARTNERSHIP:");
		
		System.out.println("SKY & PANT");
		System.out.println(suryakumarscore+rishabpantscore);
		
		System.out.println("BOWLING CONTRIBUTION");
		
		System.out.println("JASPRIT BUMBRA ECONAMY RATE");
		System.out.println(bumbragiveruns/jaspritbumbraovers);
		
		System.out.println("CHAHAL ECONOMY RATE");
		System.out.println(chahalgiveruns/chahalovers);
		
		System.out.println("JADEJA ECONOMY RATE");
		System.out.println(jadejagiveruns/ravindrajadejaovers);
		
		System.out.println("TOTAL SIX SCORE");
		System.out.println(totalsixes*6);
		
		System.out.println("TOTAL FOUR SCORE");
		System.out.println(totalfours*4);
		
		System.out.println("TOTAL BOUNDARYS");
		System.out.println(totalsixes+totalfours);
		
		System.out.println("TEAM INDIA SCORE IS");
		System.out.println(viratkohliscore+suryakumarscore+rohitsharmascore+rishabpantscore+extras-bice+totalsixes+totalfours+"-"+wicket);
		
		System.out.println("OPENENT REQUIRE RUN RATE PER OVER");
		System.out.println((viratkohliscore+suryakumarscore+rohitsharmascore+rishabpantscore+extras-bice+totalsixes+totalfours)/totalover);
			}
}
